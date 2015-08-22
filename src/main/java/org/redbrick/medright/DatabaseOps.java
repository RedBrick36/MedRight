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

  private static int rowsAffected;
  private static boolean status;
  private static boolean success;
  private static Connection con;
  private static Statement statement;
  private static CallableStatement freeze;
  private static CallableStatement backup;
  private static CallableStatement unfreeze;
  private static CallableStatement checkDB;

  private static Connection connection;
  private static Path currentPath = null;
  private static Path newPath = null;
  private static LocalDateTime now;
  private static TemporalUnit minutes;
  private static String filetime;

  public static boolean runDbaseChecks (Connection connection) throws SQLException {
    try {
      // statement = connection.createStatement ();
      checkDB = connection.prepareCall ( "VALUES SYSCS_UTIL.SYSCS_CHECK_TABLE('APP', 'TREATMENTS')" );
      checkDB.execute ();
      checkDB.close ();
      System.out.println ( "Table Treatements checked Successfully." );
    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    return success;
  }

  public static boolean backupDatabase (Connection connection) throws SQLException {

    try {
      freeze = connection.prepareCall ( "CALL SYSCS_UTIL.SYSCS_FREEZE_DATABASE()" );
      freeze.execute ();
      freeze.close ();

      backup = connection.prepareCall ( "CALL SYSCS_UTIL.SYSCS_BACKUP_DATABASE(?)" );
      backup.setString ( 1, "./DBaseBackups" );
      backup.execute ();
      backup.close ();

      unfreeze = connection.prepareCall ( "CALL SYSCS_UTIL.SYSCS_UNFREEZE_DATABASE()" );
      unfreeze.execute ();
      unfreeze.close ();
    } catch ( Exception err ) {
      System.out.println ( "Error backing up database " + err.getMessage () + err.getCause () );
    }
    return status;
  }

  public static boolean backupDatabaseTable (Connection connection) throws SQLException {
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
        statement = connection.createStatement ();
        status = statement.execute ( "CALL SYSCS_UTIL.SYSCS_EXPORT_TABLE(null,'TREATMENTS','./backup.db',null,null,null)" );
        System.out.println ( "Database Table Backed Up Successfully." );
      }
    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    return status;
  }

  public static boolean restoreDatabaseTable (Connection connection) throws SQLException {

    try {
      statement = connection.createStatement ();
      status = statement.execute ( "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null,'TREATMENTS','./backup.db',null,null,null,0)" );
      System.out.println ( "Database Table Restored Successfully." );
    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    return status;
  }

  public static boolean clearDatabaseTable (Connection connection) throws SQLException {

    try {
      statement = connection.createStatement ();
      rowsAffected = statement.executeUpdate ( "DELETE FROM TREATMENTS" );
      System.out.println ( "Database Table Treatements Cleared Successfully." );

    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    return status;
  }

}
