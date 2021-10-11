package Dataproviderparams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class Dataprovider_param {
	
	WebDriver Driver;
	
	@BeforeClass
	@Parameters  ({"Browser"})
	void setup(String sr) {
		
		if(sr.equals("Chrome")) {
			
		System.setProperty("webdriver.chrome.driver", "/Users/lalitha/Downloads/chromedriver");
		Driver=new ChromeDriver();
		
		}
		else if(sr.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "/Users/lalitha/Downloads/msedgedriver");
			Driver=new EdgeDriver();
		}
			
		
		
		else if(sr.equals("Firefox")){
				System.setProperty("webdriver.gecko.driver","/Users/lalitha/Downloads/geckodriver");
				Driver=new FirefoxDriver();
				
			}
		
		Driver.get("https://demo.nopcommerce.com/login");
				

	}
	
	
	@Test(priority=1)
	void login() {
		Driver.findElement(By.id("Email")).sendKeys("Seleniumjava@gmail.com");
		Driver.findElement(By.id("Password")).sendKeys("Selenium");
		
	}
	
	@Test(priority=2)
	
	void getTitle() {
		
		String act_title=Driver.getTitle();
		Assert.assertEquals(act_title, "nopCommerce demo store. Login", "Title matched");
		
		}
	
	@Test (priority=3)
	
	void logo() {
		
	Boolean status=Driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	Assert.assertEquals(status,"true", "Logo test is passed");
	
	}
	
	@AfterClass
	
	void close() {
		Driver.quit();
		
	}
	

}
