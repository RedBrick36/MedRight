package org.redbrick.medright;

import java.awt.*;
import java.time.*;
import java.time.temporal.*;
import javax.swing.*;

public class EventTimeSync {

// Since there is only one function that this class performs, all variables will be instance variables
    public EventTimeSync () {

    }

    protected boolean startSync (byte eh,
            byte em) throws InterruptedException {

        // Declaring instance variables
        long untilHours;
        long untilMins;
        byte eventTimeCheck = 1;
        byte eventHours;
        byte eventMins;
        eventHours = eh;
        eventMins = em;
        byte c = 1;

        // Call for sync between device clock and loops
        ClockSync cs = new ClockSync ();
        boolean status = cs.startSync ();

        try {
            while ( c == 1 ) {

                // Set the next event time according to the switch results
                LocalTime eventTime = LocalTime.of (eventHours,
                                                    eventMins);
                /*
                 * Use a while loop to run checks against the
                 * eventTime and
                 * currentLocalTime until a match event occurs: which
                 * will
                 * initialize eventTimeCheck to 0 and the loop will
                 * exit.
                 */
                while ( eventTimeCheck != 0 ) {
                    // Pull current local time
                    LocalTime timeNow_Check = LocalTime.now ();
                    /*
                     * Truncate results to minutes for direct
                     * comparison to
                     * eventTime; which is set to xxx Hours and 0
                     * minutes above
                     */
                    LocalTime currentLocalTime = timeNow_Check.
                            truncatedTo (ChronoUnit.MINUTES);
                    /*
                     * Compare eventTime and currentLocalTime and
                     * initialize
                     * eventTimeCheck with the result. The compare
                     * operation will
                     * return a 0 only in the event of a match. On
                     * no-match either a
                     * negative or positive int is returned.
                     */
                    eventTimeCheck = (byte) currentLocalTime.
                            compareTo (eventTime);
                    /*
                     * Determine the amount of hours and minutes that
                     * remain until a
                     * match occurs and store the results for each
                     * value.
                     */
                    untilHours = currentLocalTime.until (eventTime,
                                                         ChronoUnit.HOURS);
                    untilMins = currentLocalTime.until (eventTime,
                                                        ChronoUnit.MINUTES);
                    /*
                     * Since this comparison returns the TOTAL minutes
                     * to the event,
                     * we need to use modulus to return just the
                     * remainder after
                     * dividing by 60.
                     */
                    untilMins %= 60;
                    /*
                     * If eventTimeCheck was initialized to 0 due to a
                     * match then we
                     * can break out of the loop and pop up the dialog
                     * box
                     */
                    if ( eventTimeCheck == 0 ) {
                        break;
                        /*
                         * If we have counted down far enough that we
                         * are less than
                         * one hour to go, we can just print out the
                         * minutes
                         *
                         * These messages are going to stdout for now,
                         * but will be
                         * modified to be displayed in a status
                         * information box on
                         * the main application GUI.
                         */
                    }
                    else if ( untilHours == 0 ) {
                        System.out.println ("You have " + untilMins
                                + " minute(s) "
                                + "until your next treatment...");
                        // Otherwise, we will print out both the hours and minutes
                    }
                    else {
                        System.out.println ("You have " + untilHours
                                + " hour(s), and " + untilMins
                                + " minute(s) until your next treatment...");
                    }
                    /*
                     * Sleep the thread one minute to ensure that the
                     * current time's
                     * minute value has changed before proceeding.
                     */
                    Thread.sleep (60000);
                } // End inner loop
                // Re-initialize loop variables
                eventTimeCheck = 1;
                /*
                 * When the local time matches the event time, show a
                 * dialog box as
                 * a pop-up reminder to take the specified treatments.
                 *
                 * For now, we are just using the variable eventTime
                 * as a
                 * placeholder; this may be replaced by a list of
                 * treatments drawn
                 * from a database later on.
                 */
                JOptionPane.showMessageDialog (null,
                                               "It's time to take your "
                                               + eventTime
                                               + " treatments!");
                /*
                 * Since the OK button can be pushed at any random
                 * hour/minute/second after the box is displayed, we
                 * need to re-sync
                 * the loops to the clock after OK button on
                 * JOptionPane is pushed
                 */
            }
        }
        catch ( InterruptedException | HeadlessException err ) {
            System.out.println (
                    "Error while attempting to sync events: " + err.
                    getMessage ());
        }
        return true;
    }
}
