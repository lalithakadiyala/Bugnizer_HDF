package com.selenium.practice.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class testOpencartPOM {
	
	WebDriver driver;
	Loginpage_POM lp;
	
	@BeforeClass
    @Parameters({"browser"})
	void setup(String br) {
		
		if (br.equals("chrome")){
			
		System.setProperty("webdriver.chrome.driver", "/Users/lalitha/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		
		else if(br.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "/Users/lalitha/Downloads/msedgedriver");
			driver=new EdgeDriver();
		}
			
		
		
		else if(br.equals("firefox")){
				System.setProperty("webdriver.gecko.driver","/Users/lalitha/Downloads/geckodriver");
				driver=new FirefoxDriver();
				
			}
		
		
		}
	
	@Test(priority=1)
	void logo() {
		lp=new Loginpage_POM(driver);
		boolean logo=lp.logoDisplayed();
		Assert.assertEquals(logo, true);
		
}
	
	@Test (priority=2)
	void userName() {
		
	lp=new Loginpage_POM(driver);
	lp.setUserName("Admin");
	
	}
	
	@Test (priority=3)
	void password(){
		lp=new Loginpage_POM(driver);
		lp.setPassword("admin123");
		
	
	}
	
	@Test(priority=4)
	void click() {
		lp=new Loginpage_POM(driver);
		lp.click();
	}
	
     @AfterClass
     void quit() {
	 lp=new Loginpage_POM(driver);
	 lp.quit();
}
}
