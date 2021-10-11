package Group1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
@Listeners(myListener.Listener.class)

public class Group2Method {
	WebDriver driver;
	Group2 gp2;
	
	@BeforeClass
	
	void start() {
		System.setProperty("webdriver.chrome.driver", "/Users/lalitha/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	 @Test
	   void img_Displayed() {
		gp2=new Group2(driver);
		boolean status=gp2.img();
		Assert.assertEquals(status, true, "LOGO IS DISPLAYED");
	}
	   
	 @Test(dataProvider ="dp")
	 void userName(String[] d) throws InterruptedException {
		 gp2=new Group2(driver);
		  gp2.userName(d);
	  }
	 @Test 
	 void passWord() throws InterruptedException {
		 gp2=new Group2(driver);
		  gp2.passWord("jgjdgfk");
	  }
	 @Test
	  void clic() {
		 gp2=new Group2(driver);
		  gp2.click();
	  }
	 @AfterClass
	  void teardown() {
		 gp2=new Group2(driver);
		  gp2.quit();
	  }
	 
	@DataProvider(name="dp")
	 Object[]  dat() {
	 String data[][] ={{"gopilalitha@gmail.com", "svaprimi@gmail.com"}};
		 return data;
	 }

}
