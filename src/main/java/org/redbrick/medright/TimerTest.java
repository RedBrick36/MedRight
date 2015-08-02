package org.redbrick.test;

public class TimerTest {

  public static void main(String[] args) throws InterruptedException {
    
//    byte[] userCH = new byte[] { 2, 7, 10, 12, 14, 17, 19, 22};
//    byte[] userCQ = new byte[] {15, 30, 45};
//    byte qIndex = 1;
    
    ClockSync.syncClocks();
    System.out.println("Times are in sync...");
    
    // EventTimeSync.startSync(userCH, userCQ, qIndex);

  }
}
