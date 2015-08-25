/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author RedBrick
 */
public class TestExecute {

public static void main (String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

  Connection conn = null;
  PreparedStatement ps = null;
  ResultSet rs;
  DatabaseMetaData md;
  try {
    Class.forName ("org.apache.derby.jdbc.EmbeddedDriver").newInstance ();
    conn = DriverManager.getConnection ("jdbc:derby:/Users/RedBrick/NetBeansProjects/MedRight/login;create=true;user=app;password=root");
    md = conn.getMetaData ();
    rs = md.getTables (null,
                       "APPS",
                       "LOGIN",
                       null);
    if ( !rs.next () ) {
      System.out.println (
          "Table exists...");
    }
    rs.close ();
  }
  catch ( SQLException ex ) {
    Logger.getLogger (TestExecute.class.getName ()).log (Level.SEVERE, null, ex);
  }
}
}
