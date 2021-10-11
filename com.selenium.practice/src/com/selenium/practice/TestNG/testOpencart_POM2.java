package com.selenium.practice.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testOpencart_POM2 {
	
	
	WebDriver driver;
	SearchPage_POM sp;
	
	@BeforeClass
	void setup() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/lalitha/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		}

	@Test(priority=5)
	void imgDisplayed_Search_Page() {
		sp=new SearchPage_POM(driver);
		sp.img_Displayed();
		
		}
	
	@Test(priority=6)
	void Assign_leave() {
		sp=new SearchPage_POM(driver);
		sp.Assign_leave();
		
	}
	@Test(priority=7)
	void leave_List() {
		sp=new SearchPage_POM(driver);
		sp.leave_list();
	}
	@Test(priority=8)
	void time_Sheet() {
		sp=new SearchPage_POM(driver);
		sp.Time_Sheet();
		
	}
	
    @AfterClass
	void quit() {
    	sp=new SearchPage_POM(driver);
    	sp.quit();
		
	}
	
	
	
}
