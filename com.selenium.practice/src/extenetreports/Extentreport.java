package extenetreports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.*;

//@Listeners(myListener.Listener.class)

public class Extentreport {
	
	
	WebDriver Driver;

	@BeforeClass
	void start() {
	System.setProperty("webdriver.chrome.driver",  "/Users/lalitha/Downloads/chromedriver");
    Driver=new ChromeDriver();
    Driver.get("https://www.Costco.com");

}
	
	@Test(priority=1)
	void testLogo() {
		boolean status=Driver.findElement(By.xpath("//div[@class='table-cell logo hidden-xs hidden-sm hidden-md hidden-lg']//a")).isDisplayed();
        Assert.assertEquals(status,  true, "Log is present");
	}
	
	@Test(priority=2)
	void testTilte() {
		String title=Driver.getTitle();
		Assert.assertEquals(title, "Welcome to Costco Wholesale", "Titletest is paased");
		
	}
	
	
	
	
		
	
	
	@AfterClass
	void exit() {
		Driver.quit();
	}
	
}
