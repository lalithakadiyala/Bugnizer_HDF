package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class POM_test {
	
	WebDriver driver;
	POM_Opencart pm;
	
	@BeforeClass
	@Parameters({"Browser"})
	
	void setup(String sr)
	{
		if(sr.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/lalitha/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
		else if (sr.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "/Users/lalitha/Downloads/msedgedriver");
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
		
		else if (sr.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver","/Users/lalitha/Downloads/geckodriver");
			driver=new ChromeDriver();
			driver.get("https://Open");
			
			
		}
	}
    @Test(priority=1)
	void testLogo() {
		
		pm=new POM_Opencart(driver);
		boolean st=pm.checkLogopresence();
		Assert.assertEquals(st, true, "LoGO is present");
	}
	
    @Test(priority=2)
    
    void user() {
    pm=new POM_Opencart(driver);
    pm.setUserName("Admin");
    
    }
    
    @Test (priority=3)
    	
    	void pass() {
    		pm=new POM_Opencart(driver);
    		pm.setPassword("admin123");
    	}
    
    @Test(priority=4)
    
    void click() {
    	pm=new POM_Opencart(driver);
    	pm.click();
    	
    	
    }
    
    
    @Test (priority=5)
    void closes() {
    	pm=new POM_Opencart(driver);
    	pm.close();
    }
    }


