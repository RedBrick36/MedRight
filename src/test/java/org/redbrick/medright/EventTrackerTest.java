/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import static org.junit.Assert.fail;
import org.junit.*;

/**
 *
 * @author RedBrick
 */
public class EventTrackerTest {

@BeforeClass
public static void setUpClass () {
}

@AfterClass
public static void tearDownClass () {
}

public EventTrackerTest () {
}

@Before
public void setUp () {
}

@After
public void tearDown () {
}

/**
 * Test of nextEvent method, of class EventTracker.
 *
 * @throws java.lang.Exception
 */
@Test
public void testNextEvent () throws Exception {
  System.out.println ("nextEvent");
  EventTracker.nextEvent ();
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}
}
