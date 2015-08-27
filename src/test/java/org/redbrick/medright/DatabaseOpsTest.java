/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import java.sql.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.*;

/**
 *
 * @author RedBrick
 */
public class DatabaseOpsTest {

@BeforeClass
public static void setUpClass () {
}

@AfterClass
public static void tearDownClass () {
}

public DatabaseOpsTest () {
}

@Before
public void setUp () {
}

@After
public void tearDown () {
}

/**
 * Test of backupDatabase method, of class DatabaseOps.
 *
 * @throws java.lang.Exception
 */
@Test
public void testBackupDatabase () throws Exception {
  System.out.println ("backupDatabase");
  Connection con = null;
  boolean expResult = false;
  boolean result = DatabaseOps.backupDatabase (con);
  assertEquals (expResult, result);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}

/**
 * Test of backupDatabaseTables method, of class DatabaseOps.
 *
 * @throws java.lang.Exception
 */
@Test
public void testBackupDatabaseTables () throws Exception {
  System.out.println ("backupDatabaseTables");
  Connection con = null;
  boolean expResult = false;
  boolean result = DatabaseOps.backupDatabaseTables (con);
  assertEquals (expResult, result);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}

/**
 * Test of clearDatabaseTable method, of class DatabaseOps.
 *
 * @throws java.lang.Exception
 */
@Test
public void testClearDatabaseTable () throws Exception {
  System.out.println ("clearDatabaseTable");
  Connection con = null;
  boolean expResult = false;
  boolean result = DatabaseOps.clearDatabaseTable (con);
  assertEquals (expResult, result);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}

/**
 * Test of createDatabaseConnection method, of class DatabaseOps.
 *
 * @throws java.lang.Exception
 */
@Test
public void testCreateDatabaseConnection () throws Exception {
  System.out.println ("createDatabaseConnection");
  String whichdb = "";
  Connection expResult = null;
  Connection result = DatabaseOps.createDatabaseConnection (whichdb);
  assertEquals (expResult, result);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}

/**
 * Test of createTableIfNecessary method, of class DatabaseOps.
 *
 * @throws java.lang.Exception
 */
@Test
public void testCreateTableIfNecessary () throws Exception {
  System.out.println ("createTableIfNecessary");
  Connection con = null;
  boolean expResult = false;
  boolean result = DatabaseOps.createTableIfNecessary (con);
  assertEquals (expResult, result);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}

/**
 * Test of getStateOfDatabase method, of class DatabaseOps.
 *
 * @throws java.lang.Exception
 */
@Test
public void testGetStateOfDatabase () throws Exception {
  System.out.println ("getStateOfDatabase");
  Connection con = null;
  DatabaseOps.getStateOfDatabase (con);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}

/**
 * Test of restoreDatabaseTable method, of class DatabaseOps.
 *
 * @throws java.lang.Exception
 */
@Test
public void testRestoreDatabaseTable () throws Exception {
  System.out.println ("restoreDatabaseTable");
  Connection con = null;
  boolean expResult = false;
  boolean result = DatabaseOps.restoreDatabaseTable (con);
  assertEquals (expResult, result);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}

/**
 * Test of runDbaseChecks method, of class DatabaseOps.
 *
 * @throws java.lang.Exception
 */
@Test
public void testRunDbaseChecks () throws Exception {
  System.out.println ("runDbaseChecks");
  Connection con = null;
  boolean expResult = false;
  boolean result = DatabaseOps.runDbaseChecks (con);
  assertEquals (expResult, result);
  // TODO review the generated test code and remove the default call to fail.
  fail ("The test case is a prototype.");
}
}
