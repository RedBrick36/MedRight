/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

/**
 * Class to keep track of the various schedules created by the user
 * and
 * dole out the next one in line to the EventTimeSync as and hour and
 * minute
 * argument set.
 *
 * @author RedBrick
 */
public class EventTracker {

    private static final byte userHour = 0;
    private static final byte userMins = 0;

    public static void nextEvent () throws InterruptedException {

        /*
         * Code to retrieve values from a database sorted on a
         * EventTime key,
         * determine next event based upon current time, and pass the
         * arguments
         * to the startSync method in the EventTimeSync class.
         * Then we can pass arguments to the EventTimeSync() method.
         */
        EventTimeSync ets = new EventTimeSync ();
        byte eh = 0;
        byte em = 0;
        boolean status = ets.startSync (eh,
                                        em);

    }

    private EventTracker () {
    }

}
