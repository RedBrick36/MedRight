/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;
  
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author RedBrick
 */
public class StateOfTheDB {

  private static Statement statement;
  private static ResultSet resultSet;
  private static Connection connection;
  private static Connection con;  

  public static void getStateOfDatabase (Connection con) throws SQLException {
      connection = con;   
      try {
         statement = connection.createStatement ();
         resultSet = statement.executeQuery ("SELECT * from APP.TREATMENTS");
          while (resultSet.next ()) {      
            int uuid = resultSet.getInt(1);
            String type = resultSet.getString(2);
            String name = resultSet.getString(3);
            String condition = resultSet.getString(4);
            double dose = resultSet.getDouble(5);
            String measure = resultSet.getString(6);
            boolean reminder = resultSet.getBoolean(7);
            boolean monday = resultSet.getBoolean(8);
            boolean tuesday = resultSet.getBoolean(9);
            boolean wednesday = resultSet.getBoolean(10);
            boolean thursday = resultSet.getBoolean(11);
            boolean friday = resultSet.getBoolean(12);
            boolean saturday = resultSet.getBoolean(13);
            boolean sunday = resultSet.getBoolean(14);
            boolean am = resultSet.getBoolean(15);
            boolean midam = resultSet.getBoolean(16);
            boolean noon = resultSet.getBoolean(17);
            boolean midaft = resultSet.getBoolean(18);
            boolean afternoon = resultSet.getBoolean(19);
            boolean evening = resultSet.getBoolean(20);
            boolean bedtime = resultSet.getBoolean(21);
            boolean midofnight = resultSet.getBoolean(22);
            boolean allDays = resultSet.getBoolean(23);
            boolean allTimes = resultSet.getBoolean(24);
            boolean asNeeded = resultSet.getBoolean(25);
            int leadTime = resultSet.getInt(26);
            String otf = resultSet.getString(27);
            System.out.println(uuid + ", " + type + ", " + name + ", " + condition + ", " + dose + ", " + measure + ", " + reminder + ", " + monday + ", " + tuesday + ", " + wednesday + ", " + thursday + ", " + friday + ", " + saturday + ", " + sunday + ", " + am + ", " + midam + ", " + noon + ", " + midaft + ", " + afternoon + ", " + evening + ", " + bedtime + ", " + midofnight + ", " + allDays + ", " + allTimes + ", " + asNeeded + ", " + leadTime + ", " + otf + ", ");
            statement.closeOnCompletion (); 
          }
      }
      catch (SQLException err){
        System.out.println("Error executing SQL: " + err.getMessage());
      }
      catch (Exception err){
        System.out.println("Other Error: " + err.getMessage());
      }
  }
 } 
