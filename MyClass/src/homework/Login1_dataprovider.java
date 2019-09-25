//Gmail Login

package homework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login1_dataprovider {

	WebDriver driver;
	private String baseUrl;

	@BeforeTest()
	public void setUp() throws Exception {

		System.setProperty("webdriver.gecko.driver", "E:\\Shilpa\\Selenium\\Selenium Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://mail.google.com/mail/u/0/#inbox";
		driver.get(baseUrl + "/");
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test(priority = 1, dataProvider = "logindata")
	public void Login(String useremail, String password) throws IOException {

		driver.findElement(By.xpath("//input[@id='identifierId']")).clear();
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(useremail);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]")).click();

		// enter incorrect password
		driver.findElement(By.name("password")).sendKeys(password);

		// click on login button
		driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']")).click();

		String expected = "https://mail.google.com/mail/u/0/#inbox";
		String actual = driver.getCurrentUrl();
		if (expected.equals(actual)) {
			driver.findElement(By.xpath("//span[@class='gb_Ba gbii']")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[8]/div[3]/div[1]/div[1]/div[4]/header[1]/div[2]/div[5]/div[4]/div[2]/a[1]")).click();
		}

	}

	@DataProvider
	public Object[][] logindata() {

		Object[][] logindata = new Object[5][2];
		// System.out.println(m);
		logindata[0][0] = "testxyz231@gmail.com";
		logindata[0][1] = "shilpa@123";

		logindata[1][0] = "ererrr@gmail.com";
		logindata[1][1] = "4324444342";

		logindata[2][0] = "deep2@gmail.com";
		logindata[2][1] = "2342344242";

		logindata[3][0] = "dfgt@gmail.com";
		logindata[3][1] = "34324424";

		logindata[4][0] = "dsaddasdd@gmail.com";
		logindata[4][1] = "434242424";

		return logindata;

	}

	@AfterTest
	public void teardown() {

		driver.close();

	}

}