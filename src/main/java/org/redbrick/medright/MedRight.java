/**
 * Project started by RedBrick on 6/30/15.
 *
 * JDK 1.8.0_45 
 * Maven 3.3.3
 *
 * @author RedBrick
 * 
 * MedRight will assist in keeping track of medicinal regiments; both for
 * keeping the medicinal schedule as prescribed, as well as re-ordering those
 * Mediations/supplements required by the regimen.
 *
 * MedRight has been designed with ease-of-use and an uncluttered user interface 
 * as the top priorities. As a result, each pane of the GUI is limited to only 
 * displaying what is absolutely necessary for the current operation. 
 * 
 * This in no way limits its functionality or usefulness. 
 * On the contrary, providing a "bare-bones", uncluttered and easy-to-use
 * interface reduces errors and provides a clean display of associated
 * information. The underlying structure of the application maintains every
 * aspect of the regimen as a whole and provides user prompts in a focused and
 * timely fashion designed toward compliance with the regimen.
 *
 * Within the scope of this application, a treatment is defined as: Medical care
 * given by a doctor, to a patient, for an illness or injury. Because of the 
 * nature of the way the program was built, it also encompasses Fitness 
 * Treatments - mostly comprised of supplements and exercise schedules.
 *
 * Medical care can range from prescriptions for pills/liquids, to
 * vitamin/mineral supplements, to topical applications (such as ointments,
 * lotions and creams, etc.), as well as referrals to other health care
 * providers.
 *
 * As such, MedRight assists in all cases where a prescription has been issued by the
 * doctor; as well as being very useful to those who just wish to keep track of
 * their own, particular vitamin/supplement regimen.
 */
package org.redbrick.medright;

import java.sql.*;

public class MedRight {
  
  private static Connection con;
  private static Statement statement;
  private static ResultSet resultSet;
  private static ResultSet rs;
  private static Connection connection;
  private static DatabaseMetaData dbmd;
  private static boolean success;
  private static int rowsAffected;
    
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

    public static void main(String[] args) throws SQLException, InstantiationException, ClassNotFoundException, IllegalAccessException {
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
           System.out.println ("Table Treatments was created ");
         }
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
      connection.close ();      
  } 
}

