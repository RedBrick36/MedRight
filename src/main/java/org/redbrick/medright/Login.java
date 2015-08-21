/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author RedBrick
 */
public class Login {
  private static Connection con;
  private static Statement statement;
  private static ResultSet rs;
  private static Connection connection;
  private static DatabaseMetaData dbmd;
  private static boolean success;

    
  public static Connection createDatabaseConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException {

	try {
    Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
      System.out.println("Successfully located and instantiated Driver...");
    }
    catch (Exception err) {
      System.out.println ("Driver not found: " + err.getMessage ());
    }   
    try {
	con = DriverManager.getConnection("jdbc:derby:/Users/RedBrick/NetBeansProjects/MedRight/treatments;create=true;user=app;password=root");
    System.out.println ("Successfully connected to DB...");
    }
    catch (Exception err) {
            System.out.println("Could not connect to DB: " + err.getMessage ());
    }
    return con;
    }

    public static Connection main(String[] args) throws SQLException, InstantiationException, ClassNotFoundException, IllegalAccessException {
      try {
      connection = createDatabaseConnection();
      } 
      catch (InstantiationException err) {
        System.out.println("Connection Object Creation Error: " + err.getMessage()); 
      }
      catch (ClassNotFoundException err) {
        System.out.println("Class Error: " + err.getMessage()); 
      }
      catch (IllegalAccessException err) {
        System.out.println("Access Error: " + err.getMessage()); 
      }
      try { 
        dbmd = connection.getMetaData ();
        rs = dbmd.getTables (null, "APPS", "TREATMENTS", null);
         if (!rs.next()) {
           System.out.println("Table already exists -- skipping creation of TREATMENTS table"); 
         } 
         else {
           System.out.println("Table does not already exist. Creating it now."); 
           statement = connection.createStatement ();
           success = statement.execute ("CREATE TABLE TREATMENTS (uuid INTEGER default 0 primary key, type VARCHAR(10), name VARCHAR(40), condition VARCHAR(45), dose DOUBLE default 0, measure VARCHAR(11), reminder BOOLEAN default false, monday BOOLEAN default false, tuesday BOOLEAN default false, wednesday BOOLEAN default false, thursday BOOLEAN default false, friday BOOLEAN default false, saturday BOOLEAN default false, sunday BOOLEAN default false, am BOOLEAN default false, midam BOOLEAN default false, noon BOOLEAN default false, midaft BOOLEAN default false, afternoon BOOLEAN default false, evening BOOLEAN default false, bedtime BOOLEAN default false, midofnight BOOLEAN default false, allDays BOOLEAN default false, allTimes BOOLEAN default false, asNeeded BOOLEAN default false, leadTime INTEGER default 0, otf VARCHAR(20))");
           statement.closeOnCompletion ();
         }
      }   
         catch (SQLException err) {
                 System.out.println("SQL Error: " +err.getMessage());
                 }
      return connection;
      
      }
}
