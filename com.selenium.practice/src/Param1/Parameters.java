package Param1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class Parameters {
	
	WebDriver Driver;
	@BeforeClass
	void AfterClass() {
		System.setProperty("webdriver.chrome.driver", "/Users/lalitha/Downloads/chromedriver" );
		Driver=new ChromeDriver();
		Driver.get("https://demo.nopcommerce.com/login");
		}
	
	@Test(priority=1)
	void login() {
		Driver.findElement(By.id("Email")).sendKeys("jdjkfk@jf");
		Driver.findElement(By.id("Password")).sendKeys("jskd");
	}
	
	
	@Test(priority=2)
	void innerTest() {
		

	}
     
	

}
