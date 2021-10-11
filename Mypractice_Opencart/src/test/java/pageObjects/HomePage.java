package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	@FindBy(xpath="//div[@id='divLogo']//img")
	WebElement img_Logo;

	@FindBy(id="txtUsername")
	WebElement txt_Username;

	@FindBy (id="txtPassword")
	WebElement txt_Password;

	@FindBy(id="btnLogin")
	WebElement btn_Login;


	public boolean logo_img() {
		
				boolean status=	img_Logo.isDisplayed();
		         return status;
	}
    
	
	public void setUsername(String uName) {
		
		txt_Username.sendKeys(uName);
		
		
	}
	
	public void setPassword(String password) {
		
		txt_Password.sendKeys(password);
	}
	
	
	public void login_button() {
		
		btn_Login.click();
	}
	
	
	
	

	
	


}
