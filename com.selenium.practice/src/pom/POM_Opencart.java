package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Opencart {
	WebDriver driver;
	
	public POM_Opencart(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//locators
	By Loginpage_presence= By.xpath("//div[@id='divLogo']//img");
	By txt_username_loc=By.id("txtUsername");
	By txt_password_loc=By.id("txtPassword");
	By btn_login_loc=By.name("Submit");
	
	
	//Action Methods
	
	public boolean checkLogopresence() {
		
		boolean status= driver.findElement(Loginpage_presence).isDisplayed();
		return status;
		
	}
	
	public void setUserName(String name) {
		
		driver.findElement(txt_username_loc).sendKeys(name);
		
	}
	
	
	public void setPassword(String pass) {
		
		driver.findElement(txt_password_loc).sendKeys(pass);
	}
	
	public void click() {
		
		driver.findElement(Loginpage_presence).click();
	}
	
	public void close() {
		
		driver.quit();
	}
	

}
