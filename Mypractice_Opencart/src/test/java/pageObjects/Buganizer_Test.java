package pageObjects;



import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Buganizer_Test {
	
	public Logger logger;
	public Buganizer bg;
	public WebDriver driver;
	
	
	@BeforeTest
	
	public void setup() {
		logger= LogManager.getLogger(this.getClass());
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://issuetracker.google.com/issues/35905569");
		driver.manage().window().maximize();
		//bg=new Buganizer(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	
	@Test(priority=1)
	public void ch() {
		bg=new Buganizer(driver);
		bg.email("1bugselenium");
		logger.info("Email enetered");
		
		bg.ne();
		logger.info("Email next is clicked");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
		
		@SuppressWarnings("deprecation")
		@Test (priority=2)
		public void ch1() {
		
		bg=new Buganizer(driver);
		bg.pass();
		logger.info("Password Entered");
		
		bg.pnext();
		logger.info("Password next is clicked");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@SuppressWarnings("deprecation")
		@Test (priority=3)
		public void ch2() {
		bg=new Buganizer(driver);
		//bg.title();
		 String AT= driver.getTitle();
		 String ET="Sign in - Google Accounts";
		 Assert.assertEquals(AT, ET , "Title is Matched");
		 logger.info("Validation of title works");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
}
	
	
/*	@Test(priority=1)
		public void validation() {
		 
		 String tT= bg.title();
		 Assert.assertEquals(tT, "Query parameters in the BigQuery UI " , "Title is Matched");
		 logger.info("Validation of title works");
	}
		 
		 
		
		 
		 @Test(priority=2)
		 public void create() {
		
		 String cb=  bg.create_bug();
		 Assert.assertEquals(cb,  "Create Issue", "Create issue Matches");
		 logger.info("CREATE BUG TITLE MATCHES");
		 }
		 
		 @Test(priority=3)
		 
		 public void dD() {
		 bg.drop_Down();
		 bg.same_component();
		 logger.info("CREATING BUG IN SAME COMPONENT MATCHES");
		
	}
		 
		@Test(priority=4) 
		 public void searchQ() {
	     bg.search("Query");
		 }

		
		@Test(priority=5)
		public void logo() {
			boolean lg= bg.logo_present();
			Assert.assertTrue(lg, "LOGO IS PRESENT");
			logger.info("LOGO IS PRESENT");
		}

	*/





 		
