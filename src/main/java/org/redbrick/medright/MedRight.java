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
 * medications/supplements required by the regimen.
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
 * given by a doctor, to a patient, for an illness or injury.
 *
 * Medical care can range from prescriptions for pills/liquids, to
 * vitamin/mineral supplements, to topical applications (such as ointments,
 * lotions and creams, etc.), as well as referrals to other health care
 * providers.
 *
 * MedRight assists in all cases where a prescription has been issued by the
 * doctor. It can also be very useful to those who just wish to keep track of
 * their own, particular vitamin/supplement regimen.
 */
package org.redbrick.medright;
/*
 import java.util.*;
 import java.text.*;
 import javax.swing.*;
 */
public class MedRight {
    
    /*
    Create a new Schedule object and print out the default state
    */
    public static void main(String[] args) {
        String state;
        Schedule newSchedule = new Schedule();
        state = newSchedule.getState();
        System.out.println(state);
        
        /*
        Use get and set methods and recheck state...
        */
        System.out.println(); //Add in a couple of blank lines between outputs
        System.out.println();        
        newSchedule.setAm(true);
        newSchedule.setBedtime(true);
        newSchedule.setMonday(true);
        newSchedule.setWednesday(true);
        newSchedule.setFriday(true);
        state = newSchedule.getState();
        System.out.println(state);
    }
/* Processes for intial launch and data entry (draft):
     1. Display the main user GUI
        Create DB file
        For each treatment to be entered by the user: (add treatment button)
        (User required to indicate which type prior to Add New button)
        Type selected prior to Add New can be one of the following:
        Pill, Liquid, Topical, Schedule, Reminder (schedule is just an 
        alternate/different point of view for data entry)
     2. Instantiate an object from the correct class based upon user input
     3. Present user with appropriate data entry panel
        Have user fill out all fields that are delineated by the variables in 
        that classes object
        Place input values for each treatment, schedule or reminder
     4. Initialize the variables based upon user input for object
     5. Have user decide on the creation of calendar events and pop-up reminder 
        notifications
     6. Run the methods to fill in the remaining variables
     7. Run methods to accomplish:
        Place variables in the appropriate array (pill, liquid, topical)
        Place appropriate variables into Todays Schedule array
        Add child node to appropriate portion of JTree
        Add calendar event for re-order treatment
        Add reminders; if indicated by user
     8. Repeat until user is finished inputting treatments
     9. Allow user interaction through GUI to view various presentations of the 
        data gathered through a display info GUI.

   Launch Processes:
        1. At each application launch
            Display StartGUI
            Populate StartGUI fields from DB
        2. Check re-order dates on all treatments
            If any treatments are within 48 hours of re-ordering, unhide "Alerts!" 
            button on GUI
            When user presses Alerts! button
                User receives popup listing all treatments due for re-order withing 
                48 hours
        3. Check for reminders and provide popup
            Provide "Remind Later" and "Cancel" buttons
    
   Background Services:
        1. Check re-order dates on all treatments
            If any treatments are within 48 hours of re-ordering, unhide "Alerts!" 
            button on GUI
            When user presses Alerts! button
                User receives popup listing all treatments due for re-order withing 
                48 hours
        2. Check for reminders and provide popup
            Provide "Remind Later" and "Cancel" buttons
*/     

}
