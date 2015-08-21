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
