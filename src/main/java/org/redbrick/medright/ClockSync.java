package org.redbrick.medright;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ClockSync {

  /*
   * Initial sync of app's while loops to minutes on device clock; we need the thread sleep
   * timers trip events at exactly 00 seconds of each minute.
   */
  private static final byte z = 0;
  private static byte localSecs = 0;
  private static byte syncSecs = 0;
  private static byte checkSync = 1;
   
public static boolean syncClocks() {
  while (checkSync != 0) {
    LocalTime sync = LocalTime.now();
    LocalTime localSync = sync.truncatedTo(ChronoUnit.SECONDS);
    localSecs = (byte) localSync.getSecond();

    LocalTime syncCheck = LocalTime.of(z, z, z);
    LocalTime localSecsCheck = syncCheck.truncatedTo(ChronoUnit.SECONDS);
    syncSecs = (byte) localSecsCheck.getSecond();

    if (localSecs == syncSecs) {
      checkSync = 0;
    } else {
      checkSync = 1;
    }
  }
  return true;
 }
}
