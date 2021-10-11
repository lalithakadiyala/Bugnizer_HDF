package com.selenium.practice.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage_POM {
	WebDriver driver;
	
	
	public Loginpage_POM (WebDriver driver){
		
		this.driver=driver;
		
		
	}
	
	//locators
	
	By img_logo=By.xpath("//div[@id='divLogo']//img]");
	By userName=By.xpath("//input[@id='txtUsername']");
	By password=By.xpath("//input[@id='txtPassword']");
	By click=By.xpath("//input[@id='btnLogin']");
	
	
	//Action Methods
	
	public boolean logoDisplayed() {
	 boolean status=driver.findElement(img_logo).isDisplayed();
	 return status;
		
	}
	
	
	public void setUserName(String Name) {
		
		driver.findElement(userName).sendKeys(Name);
	}
	
	
	public void setPassword(String pass) {
		
		
		driver.findElement(password).sendKeys(pass);
	}
	
	public void click() {
		
		
		driver.findElement(click).click();
	}
	
	
	public void quit() {
		driver.quit();
	}
	

}
