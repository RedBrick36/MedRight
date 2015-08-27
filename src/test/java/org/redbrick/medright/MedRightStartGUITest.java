/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import java.util.logging.*;
import static org.junit.Assert.fail;
import org.junit.*;

/**
 *
 * @author RedBrick
 */
public class MedRightStartGUITest {

@BeforeClass
public static void setUpClass () {
}

@AfterClass
public static void tearDownClass () {
}

public MedRightStartGUITest () {
}

@Before
public void setUp () {
}

@After
public void tearDown () {
}

/**
 * Test of closeMedStartGUI method, of class MedRightStartGUI.
 */
@Test
public void testCloseMedStartGUI () {
  System.out.println ("closeMedStartGUI");
  MedRightStartGUI instance = null;
  try {
    instance = new MedRightStartGUI ();
  }
  catch ( ClassNotFoundException | InstantiationException | IllegalAccessException ex ) {
    Logger.getLogger (MedRightStartGUITest.class.getName ()).log (Level.SEVERE, null, ex);
  }
  instance.closeMedStartGUI ();
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}

/**
 * Test of main method, of class MedRightStartGUI.
 */
@Test
public void testMain () {
  System.out.println ("main");
  String[] args = null;
  MedRightStartGUI.main (args);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}
}
