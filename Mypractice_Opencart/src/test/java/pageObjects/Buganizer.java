package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buganizer {
	WebDriver driver;
	
	public Buganizer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath="//input[@id='identifierId']")
	WebElement email;
	
	
	@FindBy(xpath="//span[normalize-space()='Next']")
	WebElement enext;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement p;
	
	@FindBy (xpath="//span[normalize-space()='Next']")
	WebElement pNext;

    @FindBy(className="bv2-issue-title-text")
	WebElement title;
	
	/*@FindBy(xpath="//a[normalize-space()='Create hotlist']")
	WebElement cr_h;
	*/
	
	public void email(String em) {
		
		email.sendKeys(em);
	}
	
	
	public void ne() {
		enext.click();
	}
	
	
	public void pass() {
		p.sendKeys("seleniumtest");
	}
	
	public void pnext() {
		pNext.click();
		
	}
	
	/*public String title() {
	return title;
		
	}*/
	
	/*public void ch1() {
		cr_h.click();
	}*/

}
	
	
	/*@FindBy(className="bv2-issue-title-text")
	WebElement title;
	
	
	
	
	@FindBy(xpath="//h2[normalize-space()='IssueTracker']")
	WebElement logo;
	
	
	@FindBy (xpath="//textarea[@placeholder='Search IssueTracker']")
	WebElement search;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Create')]")
	WebElement create;
	
	
	@FindBy(xpath="//button[@aria-label='More options']//mat-icon[@role='img']//*[local-name()='svg']//*[name()='path' and contains(@d,'M7 10l5 5 ')]")
	WebElement dropDown;
	
	
	@FindBy(xpath="//a[normalize-space()='In Same Component']")
	WebElement same_Component;
	
	public String title() {
		return title.getText();
		
		}
	
   public boolean logo_present() {
		return logo.isDisplayed();
	}
	
	
	public String create_bug() {
		return create.getText();
	}
	
	
	public void search(String ss) {
		
		 search.sendKeys(ss);
		
		
	}
	
	
	public void drop_Down() {
		dropDown.click();
	}
	
    public void same_component() {
    	same_Component.click();
    	
    }
}*/
