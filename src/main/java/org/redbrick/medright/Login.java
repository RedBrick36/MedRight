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
import javax.swing.JOptionPane;
import javax.swing.UIManager;

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

  public static Connection createDatabaseConnection () throws ClassNotFoundException, InstantiationException, IllegalAccessException {

    try {
      UIManager.setLookAndFeel ( "javax.swing.plaf.metal.MetalLookAndFeel" );
    } catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex ) {
      java.util.logging.Logger.getLogger ( SetUserTimesGUI.class.getName () ).log ( java.util.logging.Level.SEVERE, null, ex );
    }
    try {
      Class.forName ( "org.apache.derby.jdbc.EmbeddedDriver" );
      JOptionPane.showMessageDialog ( null, "Successfully located and instantiated Embedded Driver...    " );
    } catch ( Exception err ) {
      JOptionPane.showMessageDialog ( null, err );
    }
    try {
      con = DriverManager.getConnection ( "jdbc:derby:/Users/RedBrick/NetBeansProjects/MedRight/treatments;create=true;user=app;password=root" );
      JOptionPane.showMessageDialog ( null, "Successfully connected to DB...    " );
    } catch ( Exception err ) {
      JOptionPane.showMessageDialog ( null, err );
    }
    return con;
  }

  public static boolean createTableIfNecessary () throws SQLException, InstantiationException, ClassNotFoundException, IllegalAccessException {
    try {
      dbmd = con.getMetaData ();
      rs = dbmd.getTables ( null, "APPS", "TREATMENTS", null );
      if ( !rs.next () ) {
        System.out.println ( "Table already exists -- skipping creation of TREATMENTS table     " );
      } else {
        System.out.println ( "Table does not already exist. Creating it now.     " );
        statement = connection.createStatement ();
        success = statement.execute ( "CREATE TABLE TREATMENTS (uuid INTEGER default 0 primary key, type VARCHAR(10), name VARCHAR(40), condition VARCHAR(45), dose DOUBLE default 0, measure VARCHAR(11), reminder BOOLEAN default false, monday BOOLEAN default false, tuesday BOOLEAN default false, wednesday BOOLEAN default false, thursday BOOLEAN default false, friday BOOLEAN default false, saturday BOOLEAN default false, sunday BOOLEAN default false, am BOOLEAN default false, midam BOOLEAN default false, noon BOOLEAN default false, midaft BOOLEAN default false, afternoon BOOLEAN default false, evening BOOLEAN default false, bedtime BOOLEAN default false, midofnight BOOLEAN default false, allDays BOOLEAN default false, allTimes BOOLEAN default false, asNeeded BOOLEAN default false, leadTime INTEGER default 0, otf VARCHAR(20))" );
        statement.closeOnCompletion ();
      }
    } catch ( SQLException err ) {
      JOptionPane.showMessageDialog ( null, err );
    }
    return success;

  }
}
