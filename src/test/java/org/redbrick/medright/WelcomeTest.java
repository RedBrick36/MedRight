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
public class WelcomeTest {

@BeforeClass
public static void setUpClass () {
}

@AfterClass
public static void tearDownClass () {
}

public WelcomeTest () {
}

@Before
public void setUp () {
}

@After
public void tearDown () {
}

/**
 * Test of main method, of class Welcome.
 */
@Test
public void testMain () {
  System.out.println ("main");
  String[] args = null;
  Welcome.main (args);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}

/**
 * Test of welcomeClose method, of class Welcome.
 */
@Test
public void testWelcomeClose () {
  System.out.println ("welcomeClose");
  Welcome instance = new Welcome ();
  instance.welcomeClose ();
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}
}
