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
/*
 import java.util.*;
 import java.text.*;
 import javax.swing.*;
 */
public class MedRight {

    public static void main(String[] args) {
        /*
        Create a new Schedule object and dump the default state:
        
        Define string variables to hold the default state and type
        */
        String state;
        String type;
        /*
        Instantiate a Schedule object
        */
        Schedule newSchedule = new Schedule();
        GenUUID newUUID = new GenUUID();
       /*
        Assighn the return value of the .getState() method to the string 
        variable state.
        */
        state = newSchedule.getState();
        /*
        Print out the default state
        */
        System.out.println(state);
        System.out.println(); //Add in a couple of blank lines between outputs
        System.out.println();
        /* Testing interreaction between the objects by
           setting Type and UUID to local object from what was passed into 
           and out of GenUUID object: From ScheduleDataEntryGUI simulated calls...
        */
        newUUID.setType("Pill"); // Coming from GUI type combo box 
        newSchedule.setType(newUUID.getType()); // Xfer to local schedule obj
        state = newSchedule.getState();
        System.out.println(state); // Verify results so far...
        newSchedule.setUuid(newUUID.genUuid()); // Set local uuid from method call to .genUuid
        state = newSchedule.getState();
        System.out.println(state); // Verify results so far...
        
        
//        /*
//         Use set methods to change individual values and recheck state...
//         */
//        System.out.println(); //Add in a couple of blank lines between outputs
//        System.out.println();
//        newSchedule.setAm(true);
//        newSchedule.setBedtime(true);
//        newSchedule.setMonday(true);
//        newSchedule.setWednesday(true);
//        newSchedule.setFriday(true);
//        /*
//         Re-run the .getState() method to update the value of the string variable 
//         state
//         */
//        state = newSchedule.getState();
//        /*
//         Print updated state
//         */
//        System.out.println(state);
//        /*
//         Use get methods to check individual field states
//         */
//        System.out.println(); //Add in a couple of blank lines between outputs
//        System.out.println();
//        System.out.println(newSchedule.isAm());
//        System.out.println(newSchedule.isBedtime());
//        System.out.println(newSchedule.isMonday());
//        System.out.println(newSchedule.isTuesday()); // This should return false
//        System.out.println(newSchedule.isWednesday());
//        System.out.println(newSchedule.isFriday());
        
    
    }
}
