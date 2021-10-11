package params_All;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Param_One {
	
	WebDriver Driver;
	
	
	
	@BeforeClass
	void start() {
	System.setProperty("webdriver.chrome.driver",  "/Users/lalitha/Downloads/chromedriver");
    Driver=new ChromeDriver();
    Driver.get("https://www.Amazon.com");
    
}
	
	@Test
	@Parameters({"xpath"})
	void setup(String v) {
	Driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(v);
	
}
	 @AfterClass
   void stop() {
	   Driver.quit();
   }

      

}
