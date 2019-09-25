package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNG_GmailLogin {
	
	public String app2 = "https://accounts.google.com";
	public WebDriver driver;
  @Test
  public void gmailLogin() throws InterruptedException {
	  
	  System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  
	//URL
	  driver.get(app2);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  
	  String ecpectedTitle = "Sign in – Google accounts";
	  String actualTitle = driver.getTitle();
	  System.out.println("Actual Title: "+actualTitle);
	  Assert.assertEquals(actualTitle, ecpectedTitle);
	 
	  
	  
	  //username
	  WebElement username = driver.findElement(By.name("identifier"));
	  username.clear();
	  username.sendKeys("testdeveloper30@gmail.com");
	  
	  //click on the Next button
	  driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	  
	  Thread.sleep(2000);
	  //Password 
	  WebElement password = driver.findElement(By.name("password"));
	  //password.clear();
	  password.sendKeys("123456");
	  
	  Thread.sleep(2000);
	  //Submit button
	  WebElement submit = driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']"));
	  submit.click();
	  
	 
  }
  
  @AfterTest
  
  public void QuitClass()
  {
	  
	 driver.close();
  }
  
 
  
}
