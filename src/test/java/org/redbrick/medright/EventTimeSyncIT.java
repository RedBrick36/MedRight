/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RedBrick
 */
public class EventTimeSyncIT {
  
  public EventTimeSyncIT () {
  }
  
  @BeforeClass
  public static void setUpClass () {
  }
  
  @AfterClass
  public static void tearDownClass () {
  }
  
  @Before
  public void setUp () {
  }
  
  @After
  public void tearDown () {
  }

  /**
   * Test of startSync method, of class EventTimeSync.
   */
  @Test
  public void testStartSync () throws Exception {
    System.out.println ( "startSync" );
    byte eh = 0;
    byte em = 0;
    EventTimeSync.startSync ( eh, em );
    // TODO review the generated test code and remove the default call to fail.
    fail ( "The test case is a prototype." );
  }
  
}
