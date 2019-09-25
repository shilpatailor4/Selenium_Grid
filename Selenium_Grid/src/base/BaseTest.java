package base;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {
	
	public WebDriver driver;
	ChromeOptions options;
	
	//Open Browser
	public void openBrowser(String bname)
	{
		DesiredCapabilities cab = null;
		
		if(bname.equals("Mozila"))
		{
			cab = DesiredCapabilities.firefox();
			cab.setPlatform(Platform.WINDOWS);
		}
		
		else if(bname.equals("Chrome"))
		{
			cab = DesiredCapabilities.chrome();
			cab.setPlatform(Platform.WINDOWS);
		}
		
		else if(bname.equals("Edge"))
		{
			cab = DesiredCapabilities.edge();
			cab.setPlatform(Platform.WINDOWS);
		}
		
		// URL of Hub Initilization
		try 
		{
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/grid/console"), cab);
		}
		
		catch(MalformedURLException e)
		{
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void quit() 
	{
		if(driver!=null)
			driver.close();
	}
	

}
