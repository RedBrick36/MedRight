/*
 * To change this license header, choose License Headethis.rs in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import java.awt.*;
import java.io.*;
import static java.nio.file.Files.exists;
import static java.nio.file.Files.move;
import java.nio.file.*;
import static java.nio.file.Paths.get;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.sql.*;
import java.time.*;
import static java.time.LocalDateTime.now;
import static java.time.temporal.ChronoUnit.MINUTES;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.*;

/**
 *
 * @author RedBrick
 */
public class DatabaseOps {

private static Connection con;
private CallableStatement unfreeze;
private CallableStatement freeze;
private CallableStatement backup;
private static CallableStatement checkDB;
private CallableStatement statement;
private CallableStatement cs;
private ResultSet rs;
private DatabaseMetaData md;
private Path currentPath = null;
private Path newPath = null;
private String filetime;
private static String loginDB;
private LocalDateTime now;
private boolean status;
private static int dbChoice;

/**
 *
 * @param con
 *
 * @return
 *
 * @throws SQLException
 */
public boolean backupDatabase (Connection con) throws SQLException {

  try {
    try {
      this.freeze = con.prepareCall ("CALL SYSCS_UTIL.SYSCS_FREEZE_DATABASE()");
      this.freeze.execute ();
    }
    catch ( SQLException err ) {
      System.out.println ("Could not freeze Database " + err.getMessage ());
      this.freeze.close ();
    }
    this.freeze.close ();
    try {
      this.backup = con.prepareCall ("CALL SYSCS_UTIL.SYSCS_BACKUP_DATABASE(?)");
      this.backup.setString (1, "./DBaseBackups");
      this.backup.execute ();
    }
    catch ( SQLException err ) {
      System.out.println ("Could not Backup Database " + err.getMessage ());
      this.backup.close ();
    }
    this.backup.close ();
    try {
      this.unfreeze = con.prepareCall ("CALL SYSCS_UTIL.SYSCS_UNFREEZE_DATABASE()");
      this.unfreeze.execute ();
    }
    catch ( SQLException err ) {
      System.out.println ("Could not Unfreeze Database " + err.getMessage ());
      this.unfreeze.close ();
    }
    this.unfreeze.close ();
  }
  catch ( SQLException err ) {
    System.out.println ("Error running Backup Process " + err.getMessage ());
    this.freeze.close ();
    this.backup.close ();
    this.unfreeze.close ();
    con.close ();
  }
  con.close ();
  return true;
}

/**
 *
 * @param con
 *
 * @return
 *
 * @throws SQLException
 * @throws IOException
 */
public boolean backupDatabaseTable (Connection con) throws SQLException, IOException {
  try {
    this.status = false;
    this.currentPath = get ("backup.db");
    this.status = exists (this.currentPath);
    if ( this.status ) {

      this.now = now ();
      this.now = this.now.truncatedTo (MINUTES);
      this.filetime = this.now.toString ();
      this.newPath = get ("backup. " + this.filetime + ".db");
      move (this.currentPath, this.newPath, REPLACE_EXISTING);
      System.out.println ("Database Backup File Successfully Moved");
    }
    else {
      this.statement = con.prepareCall (
          "CALL SYSCS_UTIL.SYSCS_EXPORT_TABLE(null,'TREATMENTS','./backup.db',null,null,null)");
      this.status = this.statement.execute ();
      this.statement.close ();
      con.close ();
      System.out.println ("New Backup of Database Table was Successful.");

    }
  }
  catch ( IOException ex ) {
    java.util.logging.Logger.getLogger (DatabaseOps.class.getName ()).log (java.util.logging.Level.SEVERE, null,
                                                                           ex);
    System.out.println ("IO Error! " + ex.getMessage ());
    this.statement.close ();
    con.close ();
  }
  return this.status;
}

/**
 *
 * @param con
 *
 * @return
 *
 * @throws SQLException
 */
public Boolean clearDatabaseTable (Connection con) throws SQLException {

  try {
    this.statement = con.prepareCall ("DELETE FROM TREATMENTS");
    this.statement.executeUpdate ();
    System.out.println ("Database Table Treatements Cleared Successfully.");
  }
  catch ( SQLException err ) {
    System.out.println ("SQL Error: " + err.getMessage ());
    this.statement.close ();
    con.close ();
  }
  this.statement.close ();
  con.close ();
  return this.status;
}

/**
 *
 * @param whichDB
 *
 *
 * @return
 *
 * @throws ClassNotFoundException
 * @throws InstantiationException
 * @throws IllegalAccessException
 * @throws HeadlessException
 */
public static Connection connectToDB (String whichDB)
    throws ClassNotFoundException, InstantiationException, IllegalAccessException, HeadlessException {
  if ( whichDB.equalsIgnoreCase ("login") ) {
    dbChoice = 1;
  }
  else {
    dbChoice = 2;
  }

  switch ( dbChoice ) {
    case 1:
      loginDB = "jdbc:derby:login;create=true; user=ROOT; password=ROOT";
      break;
    case 2:
      loginDB = "jdbc:derby:treatments;create=true; user=APP; password=APP";
      break;
  }

  try {
    Class.forName ("org.apache.derby.jdbc.EmbeddedDriver");
    showMessageDialog (null, "Successfully located and instantiated Embedded Driver... ");

  }
  catch ( ClassNotFoundException | HeadlessException err ) {
    showMessageDialog (null, err);
  }
  try {
    con = DriverManager.getConnection (loginDB);
    showMessageDialog (null,
                       "Successfully connected to " + loginDB + " Database.");
  }
  catch ( SQLException | HeadlessException err ) {
    System.out.println ("Exception thrown: " + err.getMessage ());
  }
  return con;
}

/**
 *
 * @param con
 *
 * @return
 *
 * @throws SQLException
 * @throws InstantiationException
 * @throws ClassNotFoundException
 * @throws IllegalAccessException
 */
public boolean createTableIfNecessary (Connection con)
    throws SQLException, InstantiationException, ClassNotFoundException, IllegalAccessException {
  try {
    this.md = con.getMetaData ();
    this.rs = this.md.getTables (null, "APP", "TREATMENTS", null);
    if ( !this.rs.next () ) {
      System.out.println ("Table already exists -- skipping creation of TREATMENTS table     ");
    }
    else {
      System.out.println ("Table does not already exist. Creating it now.     ");
      this.cs = con.prepareCall ("CREATE TABLE TREATMENTS (uuid INTEGER default 0 primary key, type VARCHAR(10),"
          + " name VARCHAR(40), condition VARCHAR(45), dose DOUBLE default 0, measure VARCHAR(11),"
          + " reminder BOOLEAN default false, monday BOOLEAN default false, tuesday BOOLEAN default false,"
          + " wednesday BOOLEAN default false, thursday BOOLEAN default false, friday BOOLEAN default false,"
          + " saturday BOOLEAN default false, sunday BOOLEAN default false, am BOOLEAN default false,"
          + " midam BOOLEAN default false, noon BOOLEAN default false, midaft BOOLEAN default false,"
          + " afternoon BOOLEAN default false, evening BOOLEAN default false, bedtime BOOLEAN default false,"
          + " midofnight BOOLEAN default false, allDays BOOLEAN default false, allTimes BOOLEAN default false,"
          + " asNeeded BOOLEAN default false, leadTime INTEGER default 0, otf VARCHAR(20))");
      this.cs.execute ();
      this.cs.close ();
      this.rs.close ();
      con.close ();
    }
  }
  catch ( SQLException err ) {
    showMessageDialog (null, err);
    this.cs.execute ();
    this.cs.close ();
    this.rs.close ();
    con.close ();
  }
  return true;
}

/**
 *
 * @param con
 *
 * @throws SQLException
 */
public void getStateOfDatabase (Connection con) throws SQLException {
  try {
    UIManager.setLookAndFeel ("javax.swing.plaf.metal.MetalLookAndFeel");
  }
  catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex ) {
    java.util.logging.Logger.getLogger (DatabaseOps.class.getName ()).log (java.util.logging.Level.SEVERE, null,
                                                                           ex);
  }
  try {
    this.statement = con.prepareCall ("SELECT * from APP.TREATMENTS");
    this.statement.execute ();
    this.md = con.getMetaData ();
    this.rs = this.md.getTables (null, "APPS", "TREATMENTS", null);
    while ( this.rs.next () ) {
      int uuid = this.rs.getInt (1);
      String type = this.rs.getString (2);
      String name = this.rs.getString (3);
      String condition = this.rs.getString (4);
      double dose = this.rs.getDouble (5);
      String measure = this.rs.getString (6);
      boolean reminder = this.rs.getBoolean (7);
      boolean monday = this.rs.getBoolean (8);
      boolean tuesday = this.rs.getBoolean (9);
      boolean wednesday = this.rs.getBoolean (10);
      boolean thursday = this.rs.getBoolean (11);
      boolean friday = this.rs.getBoolean (12);
      boolean saturday = this.rs.getBoolean (13);
      boolean sunday = this.rs.getBoolean (14);
      boolean am = this.rs.getBoolean (15);
      boolean midam = this.rs.getBoolean (16);
      boolean noon = this.rs.getBoolean (17);
      boolean midaft = this.rs.getBoolean (18);
      boolean afternoon = this.rs.getBoolean (19);
      boolean evening = this.rs.getBoolean (20);
      boolean bedtime = this.rs.getBoolean (21);
      boolean midofnight = this.rs.getBoolean (22);
      boolean allDays = this.rs.getBoolean (23);
      boolean allTimes = this.rs.getBoolean (24);
      boolean asNeeded = this.rs.getBoolean (25);
      int leadTime = this.rs.getInt (26);
      String otf = this.rs.getString (27);
      System.out.println (uuid + ", " + type + ", " + name + ", " + condition + ", " + dose + ", " + measure
          + ", " + reminder + ", " + monday + ", " + tuesday + ", " + wednesday + ", " + thursday + ", "
          + friday + ", " + saturday + ", " + sunday + ", " + am + ", " + midam + ", " + noon + ", "
          + midaft + ", " + afternoon + ", " + evening + ", " + bedtime + ", " + midofnight + ", "
          + allDays + ", " + allTimes + ", " + asNeeded + ", " + leadTime + ", " + otf + ", ");
      this.statement.close ();
      this.rs.close ();
      con.close ();

    }
  }
  catch ( SQLException err ) {
    System.out.println ("Error executing SQL: " + err.getMessage ());

//FIXME - find proper method to handle post exception closing
    this.statement.close ();
    this.rs.close ();
    con.close ();
  }
}

/**
 *
 * @param con
 *
 * @return
 *
 * @throws SQLException
 */
public boolean restoreDatabaseTable (Connection con) throws SQLException {

  try {
    this.statement = con.prepareCall (
        "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null,'TREATMENTS','./backup.db',null,null,null,0)");
    this.status = this.statement.execute ();
    System.out.println ("Database Table Restored Successfully.");
    this.statement.close ();
    con.close ();
  }
  catch ( SQLException err ) {
    System.out.println ("SQL Error: " + err.getMessage ());
  }
  this.statement.close ();
  return this.status;
}

/**
 *
 * @param con
 *
 * @return
 *
 * @throws SQLException
 */
public boolean runDatabaseChecks (Connection con) throws SQLException {

  try {
    checkDB = con.prepareCall ("VALUES SYSCS_UTIL.SYSCS_CHECK_TABLE('APP', 'TREATMENTS')");
    checkDB.execute ();
    checkDB.close ();
    con.close ();
    System.out.println ("Table Treatments checked Successfully.");
  }
  catch ( SQLException err ) {
    System.out.println ("SQL Error: " + err.getMessage ());
  }
  return true;
}

private DatabaseOps () {
}
}
