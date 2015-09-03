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
private static CallableStatement unfreeze;
private static CallableStatement freeze;
private static CallableStatement backup;
private static CallableStatement checkDB;
private static CallableStatement statement;
private static CallableStatement cs;
private static ResultSet rs;
private static DatabaseMetaData md;
private static Path currentPath = null;
private static Path newPath = null;
private static String filetime;
private static String loginDB;
private static LocalDateTime now;
private static boolean status;
private static int dbChoice;

/**
 *
 * @param con
 *
 * @return
 *
 * @throws SQLException
 */
public static boolean backupDatabase (Connection con) throws SQLException {

  try {
    try {
      freeze = con.prepareCall ("CALL SYSCS_UTIL.SYSCS_FREEZE_DATABASE()");
      freeze.execute ();
    }
    catch ( SQLException err ) {
      System.out.println ("Could not freeze Database " + err.getMessage ());
      freeze.close ();
    }
    freeze.close ();
    try {
      backup = con.prepareCall ("CALL SYSCS_UTIL.SYSCS_BACKUP_DATABASE(?)");
      backup.setString (1, "./DBaseBackups");
      backup.execute ();
    }
    catch ( SQLException err ) {
      System.out.println ("Could not Backup Database " + err.getMessage ());
      backup.close ();
    }
    backup.close ();
    try {
      unfreeze = con.prepareCall ("CALL SYSCS_UTIL.SYSCS_UNFREEZE_DATABASE()");
      unfreeze.execute ();
    }
    catch ( SQLException err ) {
      System.out.println ("Could not Unfreeze Database " + err.getMessage ());
      unfreeze.close ();
    }
    unfreeze.close ();
  }
  catch ( SQLException err ) {
    System.out.println ("Error running Backup Process " + err.getMessage ());
    freeze.close ();
    backup.close ();
    unfreeze.close ();
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
public static boolean backupDatabaseTable (Connection con) throws SQLException, IOException {
  try {
    status = false;
    currentPath = get ("backup.db");
    status = exists (currentPath);
    if ( status ) {

      now = now ();
      now = now.truncatedTo (MINUTES);
      filetime = now.toString ();
      newPath = get ("backup. " + filetime + ".db");
      move (currentPath, newPath, REPLACE_EXISTING);
      System.out.println ("Database Backup File Successfully Moved");
    }
    else {
      statement = con.prepareCall (
          "CALL SYSCS_UTIL.SYSCS_EXPORT_TABLE(null,'TREATMENTS','./backup.db',null,null,null)");
      status = statement.execute ();
      statement.close ();
      con.close ();
      System.out.println ("New Backup of Database Table was Successful.");

    }
  }
  catch ( IOException ex ) {
    java.util.logging.Logger.getLogger (DatabaseOps.class.getName ()).log (java.util.logging.Level.SEVERE, null,
                                                                           ex);
    System.out.println ("IO Error! " + ex.getMessage ());
    statement.close ();
    con.close ();
  }
  return status;
}

/**
 *
 * @param con
 *
 * @return
 *
 * @throws SQLException
 */
public static Boolean clearDatabaseTable (Connection con) throws SQLException {

  try {
    statement = con.prepareCall ("DELETE FROM TREATMENTS");
    statement.executeUpdate ();
    System.out.println ("Database Table Treatements Cleared Successfully.");
  }
  catch ( SQLException err ) {
    System.out.println ("SQL Error: " + err.getMessage ());
    statement.close ();
    con.close ();
  }
  statement.close ();
  con.close ();
  return status;
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
      loginDB = "jdbc:derby:treatments;create=true; user=APP;password=APP";
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
public static boolean createTableIfNecessary (Connection con)
    throws SQLException, InstantiationException, ClassNotFoundException, IllegalAccessException {
  try {
    md = con.getMetaData ();
    rs = md.getTables (null, "APP", "TREATMENTS", null);
    if ( !rs.next () ) {
      System.out.println ("Table already exists -- skipping creation of TREATMENTS table     ");
    }
    else {
      System.out.println ("Table does not already exist. Creating it now.     ");
      cs = con.prepareCall ("CREATE TABLE TREATMENTS (uuid INTEGER default 0 primary key, type VARCHAR(10),"
          + " name VARCHAR(40), condition VARCHAR(45), dose DOUBLE default 0, measure VARCHAR(11),"
          + " reminder BOOLEAN default false, monday BOOLEAN default false, tuesday BOOLEAN default false,"
          + " wednesday BOOLEAN default false, thursday BOOLEAN default false, friday BOOLEAN default false,"
          + " saturday BOOLEAN default false, sunday BOOLEAN default false, am BOOLEAN default false,"
          + " midam BOOLEAN default false, noon BOOLEAN default false, midaft BOOLEAN default false,"
          + " afternoon BOOLEAN default false, evening BOOLEAN default false, bedtime BOOLEAN default false,"
          + " midofnight BOOLEAN default false, allDays BOOLEAN default false, allTimes BOOLEAN default false,"
          + " asNeeded BOOLEAN default false, leadTime INTEGER default 0, otf VARCHAR(20))");
      cs.execute ();
      cs.close ();
      rs.close ();
      con.close ();
    }
  }
  catch ( SQLException err ) {
    showMessageDialog (null, err);
    cs.execute ();
    cs.close ();
    rs.close ();
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
public static void getStateOfDatabase (Connection con) throws SQLException {
  try {
    UIManager.setLookAndFeel ("javax.swing.plaf.metal.MetalLookAndFeel");
  }
  catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex ) {
    java.util.logging.Logger.getLogger (DatabaseOps.class.getName ()).log (java.util.logging.Level.SEVERE, null,
                                                                           ex);
  }
  try {
    statement = con.prepareCall ("SELECT * from APP.TREATMENTS");
    statement.execute ();
    md = con.getMetaData ();
    rs = md.getTables (null, "APPS", "TREATMENTS", null);
    while ( rs.next () ) {
      int uuid = rs.getInt (1);
      String type = rs.getString (2);
      String name = rs.getString (3);
      String condition = rs.getString (4);
      double dose = rs.getDouble (5);
      String measure = rs.getString (6);
      boolean reminder = rs.getBoolean (7);
      boolean monday = rs.getBoolean (8);
      boolean tuesday = rs.getBoolean (9);
      boolean wednesday = rs.getBoolean (10);
      boolean thursday = rs.getBoolean (11);
      boolean friday = rs.getBoolean (12);
      boolean saturday = rs.getBoolean (13);
      boolean sunday = rs.getBoolean (14);
      boolean am = rs.getBoolean (15);
      boolean midam = rs.getBoolean (16);
      boolean noon = rs.getBoolean (17);
      boolean midaft = rs.getBoolean (18);
      boolean afternoon = rs.getBoolean (19);
      boolean evening = rs.getBoolean (20);
      boolean bedtime = rs.getBoolean (21);
      boolean midofnight = rs.getBoolean (22);
      boolean allDays = rs.getBoolean (23);
      boolean allTimes = rs.getBoolean (24);
      boolean asNeeded = rs.getBoolean (25);
      int leadTime = rs.getInt (26);
      String otf = rs.getString (27);
      System.out.println (uuid + ", " + type + ", " + name + ", " + condition + ", " + dose + ", " + measure
          + ", " + reminder + ", " + monday + ", " + tuesday + ", " + wednesday + ", " + thursday + ", "
          + friday + ", " + saturday + ", " + sunday + ", " + am + ", " + midam + ", " + noon + ", "
          + midaft + ", " + afternoon + ", " + evening + ", " + bedtime + ", " + midofnight + ", "
          + allDays + ", " + allTimes + ", " + asNeeded + ", " + leadTime + ", " + otf + ", ");
      statement.close ();
      rs.close ();
      con.close ();

    }
  }
  catch ( SQLException err ) {
    System.out.println ("Error executing SQL: " + err.getMessage ());
    statement.close ();
    rs.close ();
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
public static boolean restoreDatabaseTable (Connection con) throws SQLException {

  try {
    statement = con.prepareCall (
        "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null,'TREATMENTS','./backup.db',null,null,null,0)");
    status = statement.execute ();
    System.out.println ("Database Table Restored Successfully.");
  }
  catch ( SQLException err ) {
    System.out.println ("SQL Error: " + err.getMessage ());
  }
  statement.close ();
  return status;
}

/**
 *
 * @param con
 *
 * @return
 *
 * @throws SQLException
 */
public static boolean runDatabaseChecks (Connection con) throws SQLException {

  try {
    checkDB = con.prepareCall ("VALUES SYSCS_UTIL.SYSCS_CHECK_TABLE('APP', 'TREATMENTS')");
    checkDB.execute ();
    checkDB.close ();
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
