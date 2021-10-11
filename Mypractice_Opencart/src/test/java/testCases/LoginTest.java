package testCases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class LoginTest {
	
	public Logger logger;
	public LoginPage loginpage;
	public WebDriver driver;
	
	
	@BeforeTest
	
	public void setup() {
		logger = LogManager.getLogger(this.getClass());
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
	}
	
	@Test
	
	public void login() {
		loginpage= new LoginPage(driver);
		logger.info("Driver is started");
		
		
		loginpage.account_Dropdown();
		logger.info("Dropdown is enabled");
		
		
		loginpage.login();
		logger.info("Login is selected");
		
		
		loginpage.email("jnsvdfhig@gmail.com");
		logger.info("Email is entered");
		
		
		loginpage.password("hsfjkgffvf");
		logger.info("Password is entered");
		
		loginpage.click();
		logger.info("login clicked");
		
	}
		
		
		
		
	
	
}