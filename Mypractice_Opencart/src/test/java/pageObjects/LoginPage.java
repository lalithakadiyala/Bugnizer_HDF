package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[@class='caret']")
	WebElement account_dropdown;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement login;
	
	
	@FindBy (xpath="//input[@id='input-email']")
	WebElement email;
	
	
	@FindBy(xpath= "//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login_click;
	
	
	public void account_Dropdown() {
		
		account_dropdown.click();
		
	}
	
	public void login() {
		
		login.click();
		
	}
	
	public void email(String em) {
		
		email.sendKeys(em);
	}

	public void password(String pass) {
		
		password.sendKeys(pass);
	}
	
	public void click() {
		login_click.click();
		
	}
}
