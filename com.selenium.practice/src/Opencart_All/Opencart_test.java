package Opencart_All;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
@Listeners(myListener.Listener.class)


public class Opencart_test {
	WebDriver driver;
	Opencart_Elements oe;
	Logger logger;
	
	@BeforeClass
	void setup() {
		logger=LogManager.getLogger("Log4jLogging");
		System.setProperty("webdriver.chrome.driver", "/Users/lalitha/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com");
		
	}
	@Test (priority=1)
	void account_Reg() {
		oe=new Opencart_Elements(driver);
		oe.account_reg();
		logger.debug("Account registration is success");
	}
	@Test(priority=2)
	 void register() {
		 oe=new Opencart_Elements(driver);
		 oe.register();
		 logger.debug("Registraion page is clicked");
		}
	@Test(priority=3)
	 void fName() {
		oe=new Opencart_Elements(driver);
		oe.first_Name("SAIRAMS");
		logger.debug("First Name is entered");
	
	}
	
	@Test(priority=4)
	void lName() {
		oe=new Opencart_Elements(driver);
		oe.last_Name("SHIVA");
		logger.debug("Last Name is entered");
	}
	
	@Test(priority=5)
	void email() {
		oe=new Opencart_Elements(driver);
		oe.email("shhgfjsgfkgfk@gmail.com");
		logger.debug("Email is entered");
	}
	
	@Test(priority=6)
	void teleph() {
		oe=new Opencart_Elements(driver);
		oe.telephone("Telephone is entered");
	}
   @Test(priority=7)
   void pass() {
	   oe=new Opencart_Elements(driver);
	   oe.passWord("jsdgffds");
	   logger.debug("PASSWORD is entered");
   }
   
   @Test(priority=8)
   void check_Box() {
	   oe=new Opencart_Elements(driver);
	   oe.check_box();
	   logger.debug("CHECKBOX is clicked");
	   
   }
   @Test(priority=9)
   void pass_Confirm() {
	   oe=new Opencart_Elements(driver);
	   oe.password_confirm("jsdffds");
	   logger.debug("PASSWORD_confirm is confirmed");
   }
   
   @Test(priority=10)
   void con(){
	   oe=new Opencart_Elements(driver);
	   oe.continu();
	   logger.debug("USER REgistration details are entered");
	   
   }
	   
   
   }