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
public class GenUUIDTest {

@BeforeClass
public static void setUpClass () {
}

@AfterClass
public static void tearDownClass () {
}

public GenUUIDTest () {
}

@Before
public void setUp () {
}

@After
public void tearDown () {
}

/**
 * Test of genUuid method, of class GenUUID.
 */
@Test
public void testGenUuid () {
  System.out.println ("genUuid");
  GenUUID instance = new GenUUID ();
  int expResult = 0;
  int result = instance.genUuid ();
  assertEquals (expResult, result);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}

/**
 * Test of getType method, of class GenUUID.
 */
@Test
public void testGetType () {
  System.out.println ("getType");
  GenUUID instance = new GenUUID ();
  String expResult = "";
  String result = instance.getType ();
  assertEquals (expResult, result);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}

/**
 * Test of setType method, of class GenUUID.
 */
@Test
public void testSetType () {
  System.out.println ("setType");
  String type = "";
  GenUUID instance = new GenUUID ();
  instance.setType (type);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}
}
