package Opencart_All;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Opencart_Elements {
	WebDriver driver;
	
	
	public Opencart_Elements(WebDriver driver) {
		
		this.driver=driver;
	}
	
	//loctaors
	By account_reg= By.xpath("//span[@class='caret']");
	By register=By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']");
	By firstName=By.id("input-firstname");
	By lastName=By.id("input-lastname");
	By email=By.id("input-email");
	By telephone=By.id("input-telephone");
	By passWord=By.id("input-password");
	By passWord_confirm=By.id("input-confirm");
    By checkbox=By.xpath("//input[@name='agree']");
    By conti=By.xpath("//input[@value='Continue']");
    
    
   /* Driver.findElement(By.xpath("//span[@class='caret']")).click();
    Driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")).click();
    Driver.findElement(By.id("input-firstname")).sendKeys("SAIRAM");
    Driver.findElement(By.id("input-lastname")).sendKeys("SAIRAM");
    Driver.findElement(By.id("input-email")).sendKeys("hssagkvg@gmail.com");
    Driver.findElement(By.id("input-telephone")).sendKeys("78768953");
    Driver.findElement(By.id("input-password")).sendKeys("jgjfkd");
    Driver.findElement(By.id("input-confirm")).sendKeys("jgjfkd");
    Driver.findElement(By.xpath("//input[@name='agree']")).click();
    Driver.findElement(By.xpath("//input[@value='Continue']")).click();*/
    
    
    //webElements
    
    public void account_reg() {
    	driver.findElement(account_reg).click();
    }
    
    public void register() {
    	
    	driver.findElement(register).click();
    }
    public  void first_Name(String fName) {
    	driver.findElement(firstName).sendKeys(fName);
    	
    }
    
    public void last_Name(String lName) {
    	driver.findElement(lastName).sendKeys(lName);
    }
			
    public void email(String em) {
    	driver.findElement(email).sendKeys(em);
    }
	public void telephone(String te) {
		driver.findElement(telephone).sendKeys(te);
	}
	public void passWord(String pass) {
		driver.findElement(passWord).sendKeys(pass);
	}

	public void password_confirm(String pass1) {
		driver.findElement(passWord_confirm).sendKeys(pass1);
	}
	public void check_box() {
		driver.findElement(checkbox).click();
    }
	public void continu() {
		driver.findElement(conti).click();
	}
}
