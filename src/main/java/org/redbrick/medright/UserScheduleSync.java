package org.redbrick.medright;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class UserScheduleSync {

  public static Boolean startUserScheduleSync(int eH, int eM) throws InterruptedException {
    int eventHour = 0;
    int eventMins = 0;
    eventHour = eH;
    eventMins = eM;
    boolean status = true;
    int localSecs;
    int syncSecs;
    int checkSync = 1;
    int eventTimeCheck = 1;
    long untilHours;
    long untilMins;

    // Set LocalTime variable eventTime based upon arguments passed in method call.
    LocalTime eventTime = LocalTime.of(eventHour, eventMins);

    // Initial sync of loops to minutes on device clock.

    while (checkSync != 0) {
      LocalTime sync = LocalTime.now();
      LocalTime localSync = sync.truncatedTo(ChronoUnit.SECONDS);
      localSecs = localSync.getSecond();

      LocalTime syncCheck = LocalTime.of(0, 0, 0);
      LocalTime localSecsCheck = syncCheck.truncatedTo(ChronoUnit.SECONDS);
      syncSecs = localSecsCheck.getSecond();

      if (localSecs == syncSecs) {
        checkSync = 0;
      } else {
        checkSync = 1;
      }
    }
    /*
     * Use a while loop to run checks against the eventTime and
     * currentLocalTime until a match event occurs: which will
     * initialize eventTimeCheck to 0 and the loop will exit.
     */
    while (eventTimeCheck != 0) {

      // Pull current local time
      LocalTime timeNow_Check = LocalTime.now();
      /*
       * Truncate results to minutes for direct comparison to
       * eventTime; which is set to xxx Hours and 0 minutes above
       */
      LocalTime currentLocalTime = timeNow_Check.truncatedTo(ChronoUnit.MINUTES);
      /*
       * Compare eventTime and currentLocalTime and initialize
       * eventTimeCheck with the result. The compare operation will
       * return a 0 only in the event of a match. On no-match either a
       * negative or positive int is returned.
       */
      eventTimeCheck = currentLocalTime.compareTo(eventTime);
      /*
       * Determine the amount of hours and minutes that remain until a
       * match occurs and store the results for each value.
       */
      untilHours = currentLocalTime.until(eventTime, ChronoUnit.HOURS);
      untilMins = currentLocalTime.until(eventTime, ChronoUnit.MINUTES);
      /*
       * Since this comparison returns the TOTAL minutes to the event,
       * we need to use modulus to return just the remainder after
       * dividing by 60.
       */
      untilMins %= 60;
      /*
       * If eventTimeCheck was initialized to 0 due to a match then we
       * can break out of the loop and pop up the dialog box
       */
      if (eventTimeCheck == 0) {
        break;
        /*
         * If we have counted down far enough that we are less than
         * one hour to go, we can just print out the minutes
         * 
         * These messages are going to stdout for now, but will be
         * modified to be displayed in a status information box on
         * the main application GUI.
         */
      } else if (untilHours == 0) {
        System.out.println("You have " + untilMins + " minute(s) " + "until your next treatment...");
        // Otherwise, we will print out both the hours and minutes
        Thread.sleep(60000);
      } else {
        System.out.println("You have " + untilHours + " hour(s), and " + untilMins
            + " minute(s) until your next treatment...");
        Thread.sleep(60000);
      }
  }
  /*
   * When the local time matches the event time, show a dialog box as
   * a pop-up reminder to take the specified treatments.
   * 
   * For now, we are just using the variable eventTime as a
   * placeholder; this may be replaced by a list of treatments drawn
   * from a database later on.
   */
  JOptionPane.showMessageDialog(null, "It's time to take your " + eventTime + " treatments!   ");
  return status;
  }
}
