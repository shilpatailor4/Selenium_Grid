package com.Selenium;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff_Login {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		FileReader reader=new FileReader("E:\\Shilpa\\Selenium\\workspace\\MyClass\\RediffLogin.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);
		
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement username = driver.findElement(By.name("login"));
		username.sendKeys(p.getProperty("username"));
		
		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys(p.getProperty("password"));
		
		//Remmember uncheck
		driver.findElement(By.name("remember")).click();
		
		//Click on the Go bhutton
		WebElement submit = driver.findElement(By.name("proceed"));
		submit.click();
		
		Thread.sleep(1500);
		
		System.out.println("Login! successfully.");
		Thread.sleep(3000);
		
		//Click on Write Email
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		
		// Enter To email
		WebElement toemail = driver.findElement(By.xpath("//input[@id='TO_IDcmp2']"));
		toemail.sendKeys("shilpa@mailinator.com");
		
		//driver.close();
		
		

	}

}
