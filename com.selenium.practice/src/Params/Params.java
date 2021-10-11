package Params;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Params {
	
	WebDriver Driver;
	@BeforeClass
	@Parameters({"Browser"})
	void login(String sr) {
		
		if(sr.equals("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/lalitha/Downloads/chromedriver");
		Driver=new ChromeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/");
		}
		else if (sr.equals("Edge")){
				
			System.setProperty("webdriver.Edge.driver", "/Users/lalitha/Downloads/msedgedriver");
			Driver=new EdgeDriver();
			Driver.get("https://opensource-demo.orangehrmlive.com/");
			}
		else if (sr.equals("Firefox")){
			
			System.setProperty("webdriver.gecko.driver", "/Users/lalitha/Downloads/geckodriver");
			Driver=new FirefoxDriver();
			Driver.get("https://opensource-demo.orangehrmlive.com/");
}
	}
	    @Test(priority=1)
		void testTitle() {
	    Boolean	Status=	Driver.findElement(By.xpath("//div[@id='divLogo']//img")).isDisplayed();
	    Assert.assertEquals(Status,"true","Logo is present");
			
	}
	    @Test (priority=2)
		void testLogo() {
			String title=Driver.getTitle();
			Assert.assertEquals(title, "OrangeHRM", "tiltes Matched");
			
		}
		
	    @AfterClass
	    void close() {
	    	Driver.quit();
	    }
				
	}


