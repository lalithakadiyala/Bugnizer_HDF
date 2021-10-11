package testCases;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePage;
import testBase.BaseClass;


public class Homepage_Test  {
	
	
	public WebDriver driver;
	public HomePage hp;
	
	public Logger logger;
    @BeforeClass
	public void setup() {
		
		//Log4j Logging
				logger = LogManager.getLogger(this.getClass());

		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://opensource-demo.orangehrmlive.com/");

		/*
		System.setProperty("webdriver.chrome.driver", "/Users/lalitha/Downloads/chromedriver" );
		driver=new ChromeDriver();
		 */
    }
		
		@Test
	void test_Homepage() throws IOException {
		hp=new HomePage(driver);
		logger.info("DRIVER is initiated");


		hp.setUsername("Admin");
		logger.info("USER IS ENTERED SUCCESSFULLY");

		hp.setPassword("admin123");
		logger.info("PASSWORD IS ENTERED SUCCESSFULLY");


		hp.login_button();
		logger.info("CONTINUE BUTTON IS CLICKED  SUCCESSFULLY");
		


		hp.logo_img();
		logger.info("LOGO IMG IS DISLAYED" );
		captureScreen(driver, "test_Homepage");
		
		/*
		 * if(st==true) {
		 */
			//logger.info("IMG IS DISPLAYED");
		///}
		/*else {
			logger.info("IMG IS NOT DISPLAYED ");
			captureScreen(driver, "test_Homepage");
			
			
		}*/
	}
		
		

	@AfterClass
	void teardown() {
		driver.quit();
	}
	


	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "\\screenshots\\" + tname + ".png");
		FileUtils.copyFile(source, target);
	}




}
