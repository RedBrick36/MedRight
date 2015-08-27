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
public class ClockSyncTest {

@BeforeClass
public static void setUpClass () {
}

@AfterClass
public static void tearDownClass () {
}

public ClockSyncTest () {
}

@Before
public void setUp () {
}

@After
public void tearDown () {
}

/**
 * Test of startSync method, of class ClockSync.
 */
@Test
public void testStartSync () {
  System.out.println ("startSync");
  ClockSync instance = new ClockSync ();
  boolean expResult = false;
  boolean result = instance.startSync ();
  assertEquals (expResult, result);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}
}
