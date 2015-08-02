package org.redbrick.medright;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/*
 * 
 */
public class DefaultScheduleSync {

	// add argument passing for eventHour and quarter later....
	public static void startSync() throws InterruptedException {

		int z = 0;
		int localHour;
		int localMins;
		int localHourFilter;
		int localSecs;
		int syncSecs;
		int checkSync = 1;
		int eventTimeCheck = 1;
		long untilHours;
		long untilMins;

		int eventHour = 0;
		int quarter = 0;

		int[][] timeFramesAvailable = new int[8][4];
		timeFramesAvailable[0][0] = 7; // am
		timeFramesAvailable[0][1] = 15;
		timeFramesAvailable[0][2] = 30;
		timeFramesAvailable[0][3] = 45;

		timeFramesAvailable[1][0] = 10; // midAM
		timeFramesAvailable[1][1] = 15;
		timeFramesAvailable[1][2] = 30;
		timeFramesAvailable[1][3] = 45;

		timeFramesAvailable[2][0] = 12; // noon
		timeFramesAvailable[2][1] = 15;
		timeFramesAvailable[2][2] = 30;
		timeFramesAvailable[2][3] = 45;

		timeFramesAvailable[3][0] = 14; // midAft
		timeFramesAvailable[3][1] = 15;
		timeFramesAvailable[3][2] = 30;
		timeFramesAvailable[3][3] = 45;

		timeFramesAvailable[4][0] = 17; // afternoon
		timeFramesAvailable[4][1] = 15;
		timeFramesAvailable[4][2] = 30;
		timeFramesAvailable[4][3] = 45;

		timeFramesAvailable[5][0] = 19; // evening
		timeFramesAvailable[5][1] = 15;
		timeFramesAvailable[5][2] = 30;
		timeFramesAvailable[5][3] = 45;

		timeFramesAvailable[6][0] = 22; // bedtime
		timeFramesAvailable[6][1] = 15;
		timeFramesAvailable[6][2] = 30;
		timeFramesAvailable[6][3] = 45;

		timeFramesAvailable[7][0] = 2; // midOfNight
		timeFramesAvailable[7][1] = 15;
		timeFramesAvailable[7][2] = 30;
		timeFramesAvailable[7][3] = 45;

		int c = 1;


		/*
		 * Use a switch to  to an array element that
		 * holds a particular eventTime hour; this is then used to trip pop-up
		 * reminders at the top of the eventTime hour.
		 */
		while (c == 1) {
			// Set up switch variables
			LocalTime timeNow = LocalTime.now();
			timeNow = timeNow.truncatedTo(ChronoUnit.MINUTES);
			localHour = timeNow.getHour();
			localHourFilter = timeNow.getHour();
			localMins = timeNow.getMinute();

			/*
			 * This first switch advances the localHour by 1 when on the hour of
			 * an event but it is also AFTER the top of the hour (i.e. 6:03).
			 * This code keeps the next eventTime ahead of the current time in
			 * all instances.
			 */
			if (localMins != 0) {
				switch (localHourFilter) {

				case 2:
				case 7:
				case 10:
				case 12:
				case 14:
				case 17:
				case 19:
				case 22:
					localHour = localHour + 1;
					break;
				}
				/*
				 * This switch initializes an int to the value of an array
				 * element based upon the local hour. The int variable (indexer)
				 * is used to set the eventTime.
				 */
			}
			switch (localHour) {

			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
				eventHour = timeFramesAvailable[0][0]; // 07:00 or 7am
				break;
			case 8:
			case 9:
			case 10:
				eventHour = timeFramesAvailable[1][0]; // 10:00 or 10am
				break;
			case 11:
			case 12:
				eventHour = timeFramesAvailable[2][0]; // 12:00 or 12 noon
				break;
			case 13:
			case 14:
				eventHour = timeFramesAvailable[3][0]; // 14:00 or 2pm
				break;
			case 15:
			case 16:
			case 17:
				eventHour = timeFramesAvailable[4][0]; // 17:00 or 5pm
				break;
			case 18:
			case 19:
				eventHour = timeFramesAvailable[5][0]; // 19:00 or 7pm
				break;
			case 20:
			case 21:
			case 22:
				eventHour = timeFramesAvailable[6][0]; // 22:00 or 10pm
				break;
			case 23:
			case 0:
			case 1:
			case 2:
				eventHour = timeFramesAvailable[7][0]; // 02:00 or 2am
				break;
			}
			/*
			 * Set the next event time according to the indexer of the
			 * timeFrames[][] array
			 * 
			 * Set the eventTime (a LocalTime type variable) to
			 * timeFrames[eventHour][quarter]. For the time being, I am only
			 * using top of the hour timing.
			 */
			LocalTime eventTime = LocalTime.of(eventHour, quarter);
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
				untilMins = untilMins % 60;
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
				} else {
					System.out.println("You have " + untilHours + " hour(s), and " + untilMins
							+ " minute(s) until your next treatment...");
				}
				/*
				 * Sleep the thread one minute to ensure that the current time's
				 * minute value has changed before proceeding.
				 */
				Thread.sleep(60000);
			} // End inner loop
				// Re-initialize loop variables
			eventTimeCheck = 1;
			checkSync = 1;
			/*
			 * When the local time matches the event time, show a dialog box as
			 * a pop-up reminder to take the specified treatments.
			 * 
			 * For now, we are just using the variable eventTime as a
			 * placeholder; this may be replaced by a list of treatments drawn
			 * from a database later on.
			 */
			JOptionPane.showMessageDialog(null, "It's time to take your " + eventTime + " treatments!");
			/*
			 * Since the OK button can be pushed at any random
			 * hour/minute/second after the box is displayed, we need to re-sync
			 * the loops to the clock after OK button on JOptionPane is pushed
			 */
			while (checkSync != 0) {
				LocalTime sync = LocalTime.now();
				LocalTime localSync = sync.truncatedTo(ChronoUnit.SECONDS);
				localSecs = localSync.getSecond();

				LocalTime syncCheck = LocalTime.of(z, z, z);
				LocalTime localSecsCheck = syncCheck.truncatedTo(ChronoUnit.SECONDS);
				syncSecs = localSecsCheck.getSecond();

				if (localSecs == syncSecs) {
					checkSync = 0;
				} else {
					checkSync = 1;
				}
			} // End the sync loop
		} // Run the outermost loop again...
	}
}
