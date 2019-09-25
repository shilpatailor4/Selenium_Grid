//Facebook login

package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_DataProvider {
	
	WebDriver driver;
	private String baseUrl;
	
	@BeforeTest()
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://www.facebook.com/";
		driver.get(baseUrl + "/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1, dataProvider = "logindata")
	public void Login(String useremail, String password)
	{
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(useremail);
		
		driver.findElement(By.name("pass")).sendKeys(password);
		
		//click on Login button
		driver.findElement(By.id("loginbutton")).click();
		
		String expected = "https://www.facebook.com/";
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
		String actual = driver.getCurrentUrl();
		
		if(expected.equals(actual))
		{
			driver.findElement(By.xpath("//a[@id='pageLoginAnchor']")).click();
			driver.findElement(By.xpath("//div[@id='u_d_1']/div/div/div/div/div/ul/li[12]/a/span/span")).click();
		}
	}
	
	@DataProvider
	public Object[][] logindata()
	{
		Object[][] logindata = new Object[5][2];
		logindata[0][0] = "testxyz231@gmail.com";
		logindata[0][1] = "test@123";
		
		logindata[1][0] = "test2@gmail.com";
		logindata[1][1] = "test@123";
		
		logindata[2][0] = "test3@gmail.com";
		logindata[2][1] = "test@123";
		
		logindata[3][0] = "test4@gmail.com";
		logindata[3][1] = "test@123";
		
		logindata[4][0] = "test5@gmail.com";
		logindata[4][1] = "test@123";
		
		return logindata;
		
		
	}
	
	@AfterTest
	public void quit()
	{
		//driver.close();
	}

}
