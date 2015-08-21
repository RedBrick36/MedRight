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
public class DatabaseOpsIT {
  
  public DatabaseOpsIT () {
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
   * Test of backupDatabase method, of class DatabaseOps.
   */
  @Test
  public void testBackupDatabase () throws Exception {
    System.out.println ( "backupDatabase" );
    boolean expResult = false;
    boolean result = DatabaseOps.backupDatabase ();
    assertEquals ( expResult, result );
    // TODO review the generated test code and remove the default call to fail.
    fail ( "The test case is a prototype." );
  }

  /**
   * Test of restoreDatabase method, of class DatabaseOps.
   */
  @Test
  public void testRestoreDatabase () throws Exception {
    System.out.println ( "restoreDatabase" );
    boolean expResult = false;
    boolean result = DatabaseOps.restoreDatabase ();
    assertEquals ( expResult, result );
    // TODO review the generated test code and remove the default call to fail.
    fail ( "The test case is a prototype." );
  }

  /**
   * Test of clearDatabase method, of class DatabaseOps.
   */
  @Test
  public void testClearDatabase () throws Exception {
    System.out.println ( "clearDatabase" );
    boolean expResult = false;
    boolean result = DatabaseOps.clearDatabase ();
    assertEquals ( expResult, result );
    // TODO review the generated test code and remove the default call to fail.
    fail ( "The test case is a prototype." );
  }
  
}
