/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.*;

/**
 *
 * @author RedBrick
 */
public class ScheduleDataEntryGUITest {

@BeforeClass
public static void setUpClass () {
}

@AfterClass
public static void tearDownClass () {
}

public ScheduleDataEntryGUITest () {
}

@Before
public void setUp () {
}

@After
public void tearDown () {
}

/**
 * Test of getSchedDataEntryGUI method, of class ScheduleDataEntryGUI.
 */
@Test
public void testGetSchedDataEntryGUI () {
  System.out.println ("getSchedDataEntryGUI");
  ScheduleDataEntryGUI instance = new ScheduleDataEntryGUI ();
  ScheduleDataEntryGUI expResult = null;
  ScheduleDataEntryGUI result = instance.getSchedDataEntryGUI ();
  assertEquals (expResult, result);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}

/**
 * Test of main method, of class ScheduleDataEntryGUI.
 */
@Test
public void testMain () {
  System.out.println ("main");
  String[] args = null;
  ScheduleDataEntryGUI.main (args);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}

/**
 * Test of setSchedDataEntry method, of class ScheduleDataEntryGUI.
 */
@Test
public void testSetSchedDataEntry () {
  System.out.println ("setSchedDataEntry");
  ScheduleDataEntryGUI sde = null;
  ScheduleDataEntryGUI instance = new ScheduleDataEntryGUI ();
  instance.setSchedDataEntry (sde);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}
}
