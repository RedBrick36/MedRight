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
import java.time.temporal.TemporalUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RedBrick
 */
public class DatabaseOps {

  private static boolean status;
  private static boolean success;
  private static Connection con;
  private static Statement statement;
  private static Connection connection;
  private static int rowsAffected;
  private static Files f = null;
  private static Files n = null;
  private static Path currentPath = null;
  private static Path newPath = null;
  private static LocalDateTime now;
  private static TemporalUnit minutes;
  private static String filetime;

  public static boolean runDbaseChecks (Connection connection) throws SQLException {
    try {
      statement = connection.createStatement ();
      status = statement.execute ( "CHECK TABLE TREATMENTS" );
      System.out.println ( "Table Treatements checked Successfully." );
    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    return success;
  }

  public static boolean runDbaseOptimize (Connection connection) throws SQLException {
    try {
      statement = connection.createStatement ();
      status = statement.execute ( "OPTIMIZE TABLE TREATMENTS" );
      System.out.println ( "Table Treatements optimized Successfully." );
    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    return success;
  }

  public static boolean runDbaseRepair (Connection connection) throws SQLException {
    try {
      statement = connection.createStatement ();
      status = statement.execute ( "REPAIR TABLE TREATMENTS" );
      System.out.println ( "Table Treatements repaired Successfully." );
    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    return success;
  }

  public static boolean backupDatabase (Connection connection) throws SQLException {

    status = false;
    currentPath = Paths.get("./backup.db");
    status = Files.exists (currentPath);
    if (status){
      
      now = LocalDateTime.now ();
      now = now.truncatedTo (ChronoUnit.MINUTES);
      filetime = now.toString ();
      newPath = Paths.get ( "./backup. " + filetime + ".db");
      try {
        Files.copy(currentPath, newPath, REPLACE_EXISTING);
        System.out.println ("DBase Backup File Successfully Copied");
      } catch ( IOException ex ) {
        Logger.getLogger ( DatabaseOps.class.getName() ).log ( Level.SEVERE, null, ex );
      }
    } 
    try {
      statement = connection.createStatement ();
      status = statement.execute ( "CALL SYSCS_UTIL.SYSCS_EXPORT_TABLE(null,'TREATMENTS','./backup.db',null,null,null)" );
      System.out.println ( "Database Backed Up Successfully." );
    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    return status;
  }

  public static boolean restoreDatabase (Connection connection) throws SQLException {

    try {
      statement = connection.createStatement ();
      status = statement.execute ( "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null,'TREATMENTS','./backup.db',null,null,null,0)" );
      System.out.println ( "Database Restored Successfully." );
    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    return status;
  }

  public static boolean clearDatabase (Connection connection) throws SQLException {

    try {
      statement = connection.createStatement ();
      rowsAffected = statement.executeUpdate ( "DELETE FROM TREATMENTS" );
      System.out.println ( "Database Cleared Successfully." );

    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    return status;
  }
}
