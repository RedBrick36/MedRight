/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author RedBrick
 */
public class DatabaseOps {

 
  private boolean status;
  private static Connection con;
  private Statement statement;
  private CallableStatement freeze;
  private CallableStatement backup;
  private CallableStatement unfreeze;
  private CallableStatement checkDB;
  private CallableStatement cs;
  private Path currentPath = null;
  private Path newPath = null;
  private LocalDateTime now;
  private String filetime;
  private static ResultSet rs;
  private static DatabaseMetaData dbmd;

  public DatabaseOps () {

  }

  public Connection createDatabaseConnection () throws ClassNotFoundException, InstantiationException, IllegalAccessException {

    try {
      UIManager.setLookAndFeel ( "javax.swing.plaf.metal.MetalLookAndFeel" );
    } catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex ) {
      java.util.logging.Logger.getLogger ( SetUserTimesGUI.class.getName () ).log ( java.util.logging.Level.SEVERE, null, ex );
    }
    try {
      Class.forName ( "org.apache.derby.jdbc.EmbeddedDriver" );
      JOptionPane.showMessageDialog ( null, "Successfully located and instantiated Embedded Driver...    " );
    } catch ( ClassNotFoundException | HeadlessException err ) {
      JOptionPane.showMessageDialog ( null, err );
    }
    try {
      con = DriverManager.getConnection ( "jdbc:derby:/Users/RedBrick/NetBeansProjects/MedRight/treatments;create=true;user=app;password=root" );
      JOptionPane.showMessageDialog ( null, "Successfully connected to DB...    " );
    } catch ( SQLException | HeadlessException err ) {
      System.out.println ( "" + err.getMessage () );
    }
    return con;
  }

  public boolean createTableIfNecessary (Connection con) throws SQLException, InstantiationException, ClassNotFoundException, IllegalAccessException {
    try {
      dbmd = con.getMetaData ();
      rs = dbmd.getTables ( null, "APPS", "TREATMENTS", null );
      if ( !rs.next () ) {
        System.out.println ( "Table already exists -- skipping creation of TREATMENTS table     " );
      } else {
        System.out.println ( "Table does not already exist. Creating it now.     " );
        cs = con.prepareCall ( "CREATE TABLE TREATMENTS (uuid INTEGER default 0 primary key, type VARCHAR(10), name VARCHAR(40), condition VARCHAR(45), dose DOUBLE default 0, measure VARCHAR(11), reminder BOOLEAN default false, monday BOOLEAN default false, tuesday BOOLEAN default false, wednesday BOOLEAN default false, thursday BOOLEAN default false, friday BOOLEAN default false, saturday BOOLEAN default false, sunday BOOLEAN default false, am BOOLEAN default false, midam BOOLEAN default false, noon BOOLEAN default false, midaft BOOLEAN default false, afternoon BOOLEAN default false, evening BOOLEAN default false, bedtime BOOLEAN default false, midofnight BOOLEAN default false, allDays BOOLEAN default false, allTimes BOOLEAN default false, asNeeded BOOLEAN default false, leadTime INTEGER default 0, otf VARCHAR(20))" );
        cs.execute ();
        cs.close ();
        rs.close();
      }
    } catch ( SQLException err ) {
      JOptionPane.showMessageDialog ( null, err );
    }
    return true;
  }

  public boolean runDbaseChecks (Connection con) throws SQLException {

    try {
      checkDB = con.prepareCall ( "VALUES SYSCS_UTIL.SYSCS_CHECK_TABLE('APP', 'TREATMENTS')" );
      checkDB.execute ();
      checkDB.close ();
      System.out.println ( "Table Treatements checked Successfully." );
    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    return true;
  }

  public boolean backupDatabase (Connection con) throws SQLException {

    try {
      freeze = con.prepareCall ( "CALL SYSCS_UTIL.SYSCS_FREEZE_DATABASE()" );
      freeze.execute ();
      freeze.close ();

      backup = con.prepareCall ( "CALL SYSCS_UTIL.SYSCS_BACKUP_DATABASE(?)" );
      backup.setString ( 1, "./DBaseBackups" );
      backup.execute ();
      backup.close ();

      unfreeze = con.prepareCall ( "CALL SYSCS_UTIL.SYSCS_UNFREEZE_DATABASE()" );
      unfreeze.execute ();
      unfreeze.close ();
    } catch ( Exception err ) {
      System.out.println ( "Error backing up database " + err.getMessage () );
    }
    return true;
  }

  public boolean backupDatabaseTables (Connection con) throws SQLException {
    try {
      status = false;
      currentPath = Paths.get ( "backup.db" );
      status = Files.exists ( currentPath );
      if ( status ) {

        now = LocalDateTime.now ();
        now = now.truncatedTo ( ChronoUnit.MINUTES );
        filetime = now.toString ();
        newPath = Paths.get ( "backup. " + filetime + ".db" );
        try {
          Files.move ( currentPath, newPath, REPLACE_EXISTING );
          System.out.println ( "DBase Backup File Successfully Moved" );
        } catch ( IOException ex ) {
          Logger.getLogger ( DatabaseOps.class.getName () ).log ( Level.SEVERE, null, ex );
        }
      } else {
        statement = con.createStatement ();
        status = statement.execute ( "CALL SYSCS_UTIL.SYSCS_EXPORT_TABLE(null,'TREATMENTS','./backup.db',null,null,null)" );
        System.out.println ( "Database Table Backed Up Successfully." );
      }
    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    return status;
  }
  
  public boolean restoreDatabaseTable (Connection con) throws SQLException {

    try {
      statement = con.createStatement ();
      status = statement.execute ( "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null,'TREATMENTS','./backup.db',null,null,null,0)" );
      System.out.println ( "Database Table Restored Successfully." );
    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    return status;
  }

  public boolean clearDatabaseTable (Connection con) throws SQLException {

    try {
      int rowsAffected;
      statement = con.createStatement ();
      rowsAffected = statement.executeUpdate ( "DELETE FROM TREATMENTS" );
      System.out.println ( "Database Table Treatements Cleared Successfully." );

    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    return status;
  }
  public static void getStateOfDatabase (Connection con) throws SQLException {

    try {
      UIManager.setLookAndFeel ( "javax.swing.plaf.metal.MetalLookAndFeel" );
    } catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex ) {
      java.util.logging.Logger.getLogger ( SetUserTimesGUI.class.getName () ).log ( java.util.logging.Level.SEVERE, null, ex );
    }
    CallableStatement state;
    try {
      state = con.prepareCall ( "SELECT * from APP.TREATMENTS" );
      state.execute ();
      dbmd = con.getMetaData ();
      rs = dbmd.getTables ( null, "APPS", "TREATMENTS", null );
      while ( rs.next () ) {
        int uuid = rs.getInt ( 1 );
        String type = rs.getString ( 2 );
        String name = rs.getString ( 3 );
        String condition = rs.getString ( 4 );
        double dose = rs.getDouble ( 5 );
        String measure = rs.getString ( 6 );
        boolean reminder = rs.getBoolean ( 7 );
        boolean monday = rs.getBoolean ( 8 );
        boolean tuesday = rs.getBoolean ( 9 );
        boolean wednesday = rs.getBoolean ( 10 );
        boolean thursday = rs.getBoolean ( 11 );
        boolean friday = rs.getBoolean ( 12 );
        boolean saturday = rs.getBoolean ( 13 );
        boolean sunday = rs.getBoolean ( 14 );
        boolean am = rs.getBoolean ( 15 );
        boolean midam = rs.getBoolean ( 16 );
        boolean noon = rs.getBoolean ( 17 );
        boolean midaft = rs.getBoolean ( 18 );
        boolean afternoon = rs.getBoolean ( 19 );
        boolean evening = rs.getBoolean ( 20 );
        boolean bedtime = rs.getBoolean ( 21 );
        boolean midofnight = rs.getBoolean ( 22 );
        boolean allDays = rs.getBoolean ( 23 );
        boolean allTimes = rs.getBoolean ( 24 );
        boolean asNeeded = rs.getBoolean ( 25 );
        int leadTime = rs.getInt ( 26 );
        String otf = rs.getString ( 27 );
        System.out.println ( uuid + ", " + type + ", " + name + ", " + condition + ", " + dose + ", " + measure + ", " + reminder + ", " + monday + ", " + tuesday + ", " + wednesday + ", " + thursday + ", " + friday + ", " + saturday + ", " + sunday + ", " + am + ", " + midam + ", " + noon + ", " + midaft + ", " + afternoon + ", " + evening + ", " + bedtime + ", " + midofnight + ", " + allDays + ", " + allTimes + ", " + asNeeded + ", " + leadTime + ", " + otf + ", " );
        state.close ();
        rs.close ();
      }
    } catch ( SQLException err ) {
      System.out.println ( "Error executing SQL: " + err.getMessage () );
    } catch ( Exception err ) {
      System.out.println ( "Other Error: " + err.getMessage () );
    }
  }  
}
