package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RedLogin_DataProvider {
	
	WebDriver driver;
	private String baseUrl;
	
	@BeforeTest()
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\Selenium Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://madmin.projectstatus.in/auth/login";
		driver.get(baseUrl + "/");
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1, dataProvider = "logindata")
	public void Login(String useremail, String password)
	{
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(useremail);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@class='btn btn-login btn-danger bgm-secondary btn-block']")).click();
		
		String expected = "http://madmin.projectstatus.in/";
		
		String actual = driver.getCurrentUrl();
		if(expected.equals(actual))
		{
			driver.findElement(By.xpath("//a[contains(text(),'LOGOUT')]")).click();
		}
	}
	
	
	@DataProvider
	public Object[][] logindata() {

		Object[][] logindata = new Object[5][2];
		// System.out.println(m);
		logindata[0][0] = "shilpa@mailinator.com";
		logindata[0][1] = "Shilpa@123";

		logindata[1][0] = "ererrr@test.com";
		logindata[1][1] = "4324444342";

		logindata[2][0] = "deep2@test.com";
		logindata[2][1] = "2342344242";

		logindata[3][0] = "dfgt@test.com";
		logindata[3][1] = "34324424";

		logindata[4][0] = "dsaddasdd@test.com";
		logindata[4][1] = "434242424";

		return logindata;

	}
	
	@AfterTest
	public void teardown() {

		driver.close();

	}

}
