import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {
			 static int i=1;
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
			
				System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
		        WebDriver driver = new FirefoxDriver();
		        
		        // Open website
		        driver.get("https://www.facebook.com/");
		        
		        WebElement username = driver.findElement(By.id("email"));
		        for(int i=1; i<10; i++)
		        {
		        	String e = "test"+i+"@gmail.com"; 
		        	i++;
		        	 username.sendKeys(e);
		        	 
		        }
		       
		        
		        WebElement pass = driver.findElement(By.id("pass"));
		        pass.sendKeys("123456");
		        
		        driver.findElement(By.id("u_0_2")).click();
		        
		        username.clear();
			    pass.clear();
		        
		        
		       
		      
		        
		    
		      

		       
		    }
		}