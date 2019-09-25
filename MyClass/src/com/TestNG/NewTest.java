package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
 /* @Test(priority=3)
  public void f1() {
	  
	  SoftAssert softassert = new SoftAssert();
	//  AssertJUnit.assertEquals(true, false);
	  softassert.assertEquals(true, true);
	  System.out.println("F1 print");
	 softassert.assertAll();
  }*/
  
  @Test(priority=1, dataProviderClass = Data_Providers.class, dataProvider = "data")
  public void testB(String user, String pass, String email) {
	  
	  System.out.println("F2 Print");
  }
  
  @Test(priority=2)
  public void f3() {
	  
	  System.out.println("F3 Print");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("After method");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Before Suit");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("After Suit");
  }
  
  @DataProvider
  public Object[][] data(Method m) {
	  Object[][] data = new Object[2][3];
	  
	  data[0][0] = "U1";
	  data[0][1] = "P1";
	  data[0][2] = "E1";
	  
	  data[1][0] = "U2";
	  data[1][1] = "P2";
	  data[1][2] = "E2";
	  
	  return data;
  }

}
