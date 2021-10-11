package Group1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Group2 {
	
	WebDriver driver;
	
	
   public  Group2(WebDriver driver){
		this.driver=driver;
		}

	
	//locators
	By img=By.xpath("//img[@alt='Facebook']");
	By email=By.id("email");
	By password=By.id("pass");
	By click=By.xpath("//button[normalize-space()='Log In']");
	
	
	boolean img() {
		boolean status=driver.findElement(img).isDisplayed();
		return status;
	}
	
	void userName(String[] d) throws InterruptedException {
		driver.findElement(email).sendKeys(d);
		Thread.sleep(3000);
		}
	
	void passWord(String pass) throws InterruptedException {
		driver.findElement(password).sendKeys(pass);
		Thread.sleep(3000);
	}
	
	void click() {
		
		driver.findElement(click).click();
	}
	void quit() {
		driver.quit();
	}
	
}
