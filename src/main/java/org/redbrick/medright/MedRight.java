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
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MedRight {

  private static Connection connection;
  private static boolean success;

  public static void main (String[] args) throws SQLException, InstantiationException, ClassNotFoundException, IllegalAccessException {
    try {
      UIManager.setLookAndFeel ( "javax.swing.plaf.metal.MetalLookAndFeel" );
    } catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex ) {
      java.util.logging.Logger.getLogger ( SetUserTimesGUI.class.getName () ).log ( java.util.logging.Level.SEVERE, null, ex );
    }
    try {
      connection = Login.createDatabaseConnection ();
      success = Login.createTableIfNecessary ();
      if ( !success ) {
        JOptionPane.showMessageDialog ( null, "Database Table already exist. Skipping creation of TREATMENTS table.     " );
      } else {
        JOptionPane.showMessageDialog ( null, "Created new blank database table.    " );
      }
    } catch ( SQLException | InstantiationException | ClassNotFoundException | IllegalAccessException err ) {
      JOptionPane.showMessageDialog ( null, "Error Logging In to System    " );
    }
    int confDisplayContents = JOptionPane.showConfirmDialog ( null, "Would you like to display the State of the Database to the output console?     ", "State of the Database", JOptionPane.YES_NO_OPTION );
    if ( confDisplayContents == JOptionPane.YES_OPTION ) {
      StateOfTheDB.getStateOfDatabase ( connection );
    }
    int confBackup = JOptionPane.showConfirmDialog ( null, "Would you like to Backup the Database?     ", "Backup Database", JOptionPane.YES_NO_OPTION );
    if ( confBackup == JOptionPane.YES_OPTION ) {
      DatabaseOps.backupDatabase (connection);
    }
    int confCheck = JOptionPane.showConfirmDialog ( null, "Would you like to Check the Database?     ", "Check Database", JOptionPane.YES_NO_OPTION );
    if ( confCheck == JOptionPane.YES_OPTION ) {
      DatabaseOps.runDbaseChecks (connection);
    }
    int confOptimize = JOptionPane.showConfirmDialog ( null, "Would you like to Optimize the Database?     ", "Optimize Database", JOptionPane.YES_NO_OPTION );
    if ( confOptimize == JOptionPane.YES_OPTION ) {
      DatabaseOps.runDbaseOptimize (connection);
    }
    int confRepair = JOptionPane.showConfirmDialog ( null, "Would you like to Repair the Database?     ", "Repair Database", JOptionPane.YES_NO_OPTION );
    if ( confRepair == JOptionPane.YES_OPTION ) {
      DatabaseOps.runDbaseRepair (connection);
    }    
    connection.close ();
  }
}
