package com.testNG.programms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Squencing {
	
	@Test
	public void testCase1() {
		
		System.out.println("This will execute test Case1");
	}
	
	@Test
	public void testCase2() {
		
		System.out.println("This will execute test Case2");
	}
	
	@BeforeMethod
	
	public void beforeMethod() {
		
		System.out.println("This will execute before method");
	}
	
	@AfterMethod
	
	public void afterMethod() {
		
		System.out.println("This will execute after method");
	}
	
	@BeforeClass
	
	public void beforeClass() {
		
		System.out.println("This will execute before class");
	}

	@AfterClass
	
	public void afterClass() {
		
		System.out.println("This will execute after class");
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("This will execute before Test");
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("This will execute after Test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("This will execute before suite");
	}
	
	@AfterSuite
	
	public void afterSuite() {
		
		System.out.println("This will execute after suite");
	}
}
