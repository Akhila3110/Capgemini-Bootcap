package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SampleTestCase {
  @Test
  public void testCase1() {
	  System.out.println("TestCase1 : Login");
  }
  public void testCase2() {
	  System.out.println("TestCase2 : Search");
  }
  public void testCase3() {
	  System.out.println("TestCase3 : Logout");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method : Launch App");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method : Close App");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class : Create TestData");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class : Clear TestData");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test : Smoke Testing");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test : Genereate Reportes");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" Before Suite : Dp Connection");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suit : Close Dp Connection");
  }

}
