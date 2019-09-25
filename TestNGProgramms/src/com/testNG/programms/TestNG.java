package com.testNG.programms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNG {
	
	public WebDriver driver;
	
  @Test
  public void main() {
	  
		
		  //driver.findElement(By.name(" Log in ")).click();
		 
		  driver.findElement(By.id("wpmp_username")).sendKeys("ertest");
		  
		 driver.findElement(By.id("wpmp_password")).sendKeys("123456");
		 
		 driver.findElement(By.xpath("//*[@id=\"wpmpLoginForm\"]/div[4]/div[2]/div/button")).click();
		 
		 System.out.println("Sucessfully login!!");
		
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
		  
		   // Create a new instance of the Firefox driver
	  
	          System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\geckodriver.exe");
		 
		      driver = new FirefoxDriver();
		 
		      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		 
		      driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		 
		      //Launch the Online Store Website
		 
		      driver.get("http://yipyay.projectstatus.in/login");
		 
		  }
  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }
  
}
