/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import java.sql.*;

/**
 *
 * @author RedBrick
 */
public class DatabaseOps {

  private static boolean status;
  private static Connection con;
  private static Statement statement;
  private static Connection connection;
  private static int rowsAffected;

  public static Connection createDatabaseConnection () throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    try {
      Class.forName ( "org.apache.derby.jdbc.EmbeddedDriver" );
      System.out.println ( "Successfully located and instantiated Driver..." );
    } catch ( Exception err ) {
      System.out.println ( "Driver not found: " + err.getMessage () );
    }
    try {
      con = DriverManager.getConnection ( "jdbc:derby:/Users/RedBrick/NetBeansProjects/MedRight/treatments;create=true;user=app;password=root" );
      System.out.println ( "Successfully connected to DB..." );
    } catch ( Exception err ) {
      System.out.println ( "Could not connect to DB: " + err.getMessage () );
    }
    return con;
  }

  public static void main (String[] args) throws SQLException, InstantiationException, ClassNotFoundException, IllegalAccessException {
    try {
      connection = createDatabaseConnection ();
    } catch ( InstantiationException err ) {
      System.out.println ( "Connection Object Creation Error: " + err.getMessage () );
    } catch ( ClassNotFoundException err ) {
      System.out.println ( "Class Error: " + err.getMessage () );
    } catch ( IllegalAccessException err ) {
      System.out.println ( "Access Error: " + err.getMessage () );
    }
  }

  public static boolean backupDatabase () throws SQLException {

    try {
      statement = connection.createStatement ();
      status = statement.execute ( "CALL SYSCS_UTIL.SYSCS_EXPORT_TABLE(null,'TREATMENTS','./backup.db',null,null,null)" );
      System.out.println ( "Database Backed Up Successfully." );
    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    connection.close ();
    return status;
  }

  public static boolean restoreDatabase () throws SQLException {

    try {
      statement = connection.createStatement ();
      status = statement.execute ( "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null,'TREATMENTS','./backup.db',null,null,null,0)" );
      System.out.println ( "Database Restored Successfully." );
    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    connection.close ();
    return status;
  }

  public static boolean clearDatabase () throws SQLException {

    try {
      statement = connection.createStatement ();
      rowsAffected = statement.executeUpdate ( "DELETE FROM TREATMENTS" );
      System.out.println ( "Database Cleared Successfully." );

    } catch ( SQLException err ) {
      System.out.println ( "SQL Error: " + err.getMessage () );
    }
    statement.closeOnCompletion ();
    connection.close ();
    return status;
  }
}
