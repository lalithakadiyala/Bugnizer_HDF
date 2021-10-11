package Group1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class Group1Method {


	WebDriver driver;
	Group1 gp;

	
	@BeforeClass(groups={"san", "reg"})
	@Parameters({"Browser", "url"})
	void start(String sr, String s) {
		
		if(sr.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver", "/Users/lalitha/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get(s);
	}
		else if (sr.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "/Users/lalitha/Downloads/msedgedriver");
			driver=new EdgeDriver();
			driver.get(s);
		}
		else if(sr.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver","/Users/lalitha/Downloads/geckodriver");
			driver=new FirefoxDriver();
			driver.get(s);
			
			}
			}
	
	@Test(priority=1, groups={"san", "reg"})
	public boolean imgDis() {
		
		boolean dis=gp.imgDisplayed();
		Assert.assertEquals(dis, true, "IMAGE DISPLAYED");
		return dis;
	}
   @Test(priority=2, groups={"san"})
   void searc() {
	   gp=new Group1(driver);
	  gp.sear("Kids lehangas");
   }
   
   @Test(dataProvider="data", groups = {"da"})
   void dataproviderSearch(String d1) {
	   gp=new Group1(driver);
		  gp.sear(d1);
	   
   }
   
   @Test(priority=3, groups={"reg"})
   
   void searc1() {
	   gp=new Group1(driver);
	  gp.sear("Boys swim wear");
   }
   
   @Test(priority=4, groups= {"san", "reg"})
   void click() {
	   gp=new Group1(driver);
	   gp.click();
   }
   
   @AfterClass(groups= {"san", "reg"})
   void quit() {
	   gp=new Group1(driver);
	   gp.quit();
	   
   }
   
   
   @DataProvider(name="data")
   String[] data() {
	   
	   String[] d= {"Kidsswimwear","Boys swimwear", "kitchen gadjets"};
	   return d;
   }
}




