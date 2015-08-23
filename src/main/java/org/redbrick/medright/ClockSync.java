package org.redbrick.medright;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ClockSync {

  /*
   * Initial sync of app's while loops to minutes on device clock; we need the thread sleep
   * timer to trip events at exactly 00 seconds of each minute.
   */
  public ClockSync () {
    
  }
  protected boolean startSync () {
    byte z = 0;
    byte localSecs;
    byte syncSecs;
    byte checkSync = 1;

    try {
    while ( checkSync != 0 ) {
      LocalTime sync = LocalTime.now ();
      LocalTime localSync = sync.truncatedTo ( ChronoUnit.SECONDS );
      localSecs = (byte) localSync.getSecond ();

      LocalTime syncCheck = LocalTime.of ( z, z, z );
      LocalTime localSecsCheck = syncCheck.truncatedTo ( ChronoUnit.SECONDS );
      syncSecs = (byte) localSecsCheck.getSecond ();

      if ( localSecs == syncSecs ) {
        checkSync = 0;
      } else {
        checkSync = 1;
      }
    }
    } catch (Exception err){
           System.out.println ("Error While Syncing Clocks: " + err.getMessage ());
        }
    return true;
  }
}
