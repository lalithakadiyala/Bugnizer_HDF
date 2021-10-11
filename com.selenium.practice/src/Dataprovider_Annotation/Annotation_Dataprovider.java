package Dataprovider_Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Annotation_Dataprovider {
	WebDriver Driver;
	
	@BeforeClass
	
	void setup(){
		System.setProperty("webdriver.chrome.driver", "/Users/lalitha/Downloads/chromedriver");
		Driver=new ChromeDriver();
	}
		
		
		@Test(dataProvider="dp1")
		
		void login(String username, String password)
		{		
		Driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		Driver.findElement(By.id("pass")).sendKeys(password);
		Driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();
		
	}
		
		
		@AfterClass
		void teardown(){
		Driver.quit();
		}
		
		
		@DataProvider(name="dp1")
		String [][] email() {
			String data[][]= {{"gopilalitha@gmai.com", "SAITAM"},{ "parimilalitha@gmail.com", "jgfjsgaf"},
					{"lalithakadiyala9@gmail.com", "jgshjf"}};
			
			return data;
			}
			
		}
		
		
		
		
	
	


