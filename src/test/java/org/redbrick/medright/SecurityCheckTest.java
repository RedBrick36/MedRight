/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import java.sql.*;
import java.util.logging.*;
import static org.junit.Assert.fail;
import org.junit.*;

/**
 *
 * @author RedBrick
 */
public class SecurityCheckTest {

@BeforeClass
public static void setUpClass () {
}

@AfterClass
public static void tearDownClass () {
}

public SecurityCheckTest () {
}

@Before
public void setUp () {
}

@After
public void tearDown () {
}

/**
 * Test of main method, of class SecurityCheck.
 */
@Test
public void testMain () {
  System.out.println ("main");
  String[] args = null;
  SecurityCheck.main (args);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}

/**
 * Test of securityCheckClose method, of class SecurityCheck.
 */
@Test
public void testSecurityCheckClose () {
  System.out.println ("securityCheckClose");
  SecurityCheck instance = null;
  try {
    instance = new SecurityCheck ();
  }
  catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex ) {
    Logger.getLogger (SecurityCheckTest.class.getName ()).log (Level.SEVERE, null, ex);
  }
  instance.securityCheckClose ();
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}
}
