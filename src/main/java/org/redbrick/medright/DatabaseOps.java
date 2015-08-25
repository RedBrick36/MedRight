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

//private static String Login;
private static CallableStatement backup;
private static CallableStatement checkDB;
private static Connection con;
private static CallableStatement cs;
private static Path currentPath = null;
private static String filetime;
private static CallableStatement freeze;
private static DatabaseMetaData md;
private static Path newPath = null;
private static LocalDateTime now;
private static ResultSet rs;
private static CallableStatement statement;
private static boolean status;
//private static String treatments;
private static CallableStatement unfreeze;
// private static String whichdb;

/**
 *
 * @param con
 *
 * @return
 *
 * @throws SQLException
 */
public static boolean backupDatabase (Connection con) throws
    SQLException {

  try {
    freeze = con.prepareCall (
        "CALL SYSCS_UTIL.SYSCS_FREEZE_DATABASE()");
    freeze.execute ();
    freeze.close ();

    backup = con.prepareCall (
        "CALL SYSCS_UTIL.SYSCS_BACKUP_DATABASE(?)");
    backup.setString (1,
                      "./DBaseBackups");
    backup.execute ();
    backup.close ();

    unfreeze = con.prepareCall (
        "CALL SYSCS_UTIL.SYSCS_UNFREEZE_DATABASE()");
    unfreeze.execute ();
    unfreeze.close ();
  }
  catch ( SQLException err ) {
    System.out.println ("Error backing up database " + err.
        getMessage ());
  }
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
public static boolean backupDatabaseTables (Connection con) throws
    SQLException, IOException {
  try {
    status = false;
    currentPath = get ("backup.db");
    status = exists (currentPath);
    if ( status ) {

      now = now ();
      now = now.truncatedTo (MINUTES);
      filetime = now.toString ();
      newPath = get ("backup. " + filetime
          + ".db");
      move (currentPath, newPath, REPLACE_EXISTING);
      System.out.println (
          "Database Backup File Successfully Moved");
    }
    else {
      statement = con.prepareCall ("CALL SYSCS_UTIL.SYSCS_EXPORT_TABLE(null,'TREATMENTS','./backup.db',null,null,null)");
      status = statement.execute ();
      statement.close ();
      System.out.println (
          "New Backup of Database Table was Successful.");
    }
  }
  catch ( IOException ex ) {
    java.util.logging.Logger.getLogger (
        DatabaseOps.class.getName ()).
        log (java.util.logging.Level.SEVERE,
             null,
             ex);
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
public static boolean clearDatabaseTable (Connection con) throws
    SQLException {

  try {
    statement = con.prepareCall ("DELETE FROM TREATMENTS");
    statement.executeUpdate ();
    System.out.println (
        "Database Table Treatements Cleared Successfully.");
  }
  catch ( SQLException err ) {
    System.out.println ("SQL Error: " + err.getMessage ());
  }
  statement.close ();
  return status;
}

/**
 *
 * @param whichdb
 *
 *
 * @return
 *
 * @throws ClassNotFoundException
 * @throws InstantiationException
 * @throws IllegalAccessException
 */
public static Connection createDatabaseConnection (String whichdb) throws
    ClassNotFoundException, InstantiationException, IllegalAccessException {

  String name = whichdb;

  switch ( name ) {
    case "login":
      name = "jdbc:derby:/Users/RedBrick/NetBeansProjects/MedRight/login;create=true;user=root;password=root";
      break;
    case "treatments":
      name = "jdbc:derby:/Users/RedBrick/NetBeansProjects/MedRight/treatments;create=true;user=app;password=root";
      break;
  }
//  try {
//    UIManager.setLookAndFeel (
//        "javax.swing.plaf.metal.MetalLookAndFeel");
//  }
//  catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex ) {
//    java.util.logging.Logger.getLogger (
//        MedRightStartGUI.class.getName ()).
//        log (java.util.logging.Level.SEVERE,
//             null,
//             ex);
//  }
  try {
    Class.forName ("org.apache.derby.jdbc.EmbeddedDriver");
    //    showMessageDialog (null,
    //"Successfully located and instantiated Embedded Driver...    "

  }
  catch ( ClassNotFoundException |
          HeadlessException err ) {
    showMessageDialog (null,
                       err);
  }
  try {
    con = DriverManager.getConnection (name);
//    showMessageDialog (null,
//                       "Successfully connected to DB...    ");
  }
  catch ( SQLException |
          HeadlessException err ) {
    System.out.println ("SQL or Headless Exception: " + err.getMessage ());
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
public static boolean createTableIfNecessary (Connection con) throws
    SQLException, InstantiationException, ClassNotFoundException, IllegalAccessException {
  try {
    md = con.getMetaData ();
    rs = md.getTables (null,
                       "APPS",
                       "TREATMENTS",
                       null);
    if ( !rs.next () ) {
      System.out.println (
          "Table already exists -- skipping creation of TREATMENTS table     ");
    }
    else {
      System.out.println (
          "Table does not already exist. Creating it now.     ");
      cs = con.prepareCall (
          "CREATE TABLE TREATMENTS (uuid INTEGER default 0 primary key, type VARCHAR(10), name VARCHAR(40), this.condition VARCHAR(45), dose DOUBLE default 0, measure VARCHAR(11), reminder BOOLEAN default false, monday BOOLEAN default false, tuesday BOOLEAN default false, wednesday BOOLEAN default false, thuthis.rsday BOOLEAN default false, friday BOOLEAN default false, saturday BOOLEAN default false, sunday BOOLEAN default false, am BOOLEAN default false, midam BOOLEAN default false, noon BOOLEAN default false, midaft BOOLEAN default false, afternoon BOOLEAN default false, evening BOOLEAN default false, bedtime BOOLEAN default false, midofnight BOOLEAN default false, allDays BOOLEAN default false, allTimes BOOLEAN default false, asNeeded BOOLEAN default false, leadTime INTEGER default 0, otf VARCHAR(20))");
      cs.execute ();
      cs.close ();
      rs.close ();
    }
  }
  catch ( SQLException err ) {
    showMessageDialog (null,
                       err);
  }
  return true;
}

/**
 *
 * @param con
 *
 * @throws SQLException
 */
public static void getStateOfDatabase (Connection con) throws
    SQLException {
  try {
    UIManager.setLookAndFeel (
        "javax.swing.plaf.metal.MetalLookAndFeel");
  }
  catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex ) {
    java.util.logging.Logger.getLogger (
        DatabaseOps.class.getName ()).
        log (java.util.logging.Level.SEVERE,
             null,
             ex);
  }
  try {
    statement = con.prepareCall (
        "SELECT * from APP.TREATMENTS");
    statement.execute ();
    md = con.getMetaData ();
    rs = md.getTables (null,
                       "APPS",
                       "TREATMENTS",
                       null);
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
      System.out.println (uuid + ", " + type + ", " + name
          + ", " + condition + ", " + dose
          + ", "
          + measure + ", " + reminder + ", "
          + monday
          + ", " + tuesday + ", " + wednesday
          + ", "
          + thursday + ", " + friday + ", "
          + saturday
          + ", " + sunday + ", " + am + ", "
          + midam
          + ", " + noon + ", " + midaft + ", "
          + afternoon + ", " + evening + ", "
          + bedtime
          + ", " + midofnight + ", " + allDays
          + ", "
          + allTimes + ", " + asNeeded + ", "
          + leadTime
          + ", " + otf + ", ");
      statement.close ();
      rs.close ();
    }
  }
  catch ( SQLException err ) {
    System.out.println ("Error executing SQL: " + err.
        getMessage ());
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
public static boolean restoreDatabaseTable (Connection con) throws
    SQLException {

  try {
    statement = con.prepareCall ("CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null,'TREATMENTS','./backup.db',null,null,null,0)");
    status = statement.execute ();
    System.out.println (
        "Database Table Restored Successfully.");
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
public static boolean runDbaseChecks (Connection con) throws
    SQLException {

  try {
    checkDB = con.prepareCall (
        "VALUES SYSCS_UTIL.SYSCS_CHECK_TABLE('APP', 'TREATMENTS')");
    checkDB.execute ();
    checkDB.close ();
    System.out.println (
        "Table Treatements checked Successfully.");
  }
  catch ( SQLException err ) {
    System.out.println ("SQL Error: " + err.getMessage ());
  }
  return true;
}

private DatabaseOps () {
}
}
