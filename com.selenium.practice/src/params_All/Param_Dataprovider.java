package params_All;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

@Listeners(myListener.Listener.class)
public class Param_Dataprovider {
	
	
	
	
	WebDriver Driver;
	
	
	@BeforeClass
	void initiate() {
		System.setProperty("webdriver.chrome.driver",  "/Users/lalitha/Downloads/chromedriver");
	    Driver=new ChromeDriver();
	    Driver.get("https://www.costco.com");
	}
	
	@Test(dataProvider="dp1")
	void search(String data) throws InterruptedException {
		Driver.findElement(By.id("search-field")).sendKeys(data);
		Driver.findElement(By.xpath("//button[@aria-label='Search']//i[@class='co-search-thin']")).click();
		Thread.sleep(3000);
		
	}
	
	@AfterClass
	void close() {
		Driver.quit();
	}
	
	
	@DataProvider(name="dp1")
	Object[][] logindata()
	{
		Object data[][]= { {"Trousers"}, {"Grocery"}, {"Shirts"}};
		
		return data;
		
	
}
}
