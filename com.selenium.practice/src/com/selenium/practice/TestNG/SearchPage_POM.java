package com.selenium.practice.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage_POM {

	WebDriver Driver;


	SearchPage_POM(WebDriver Driver){
		this.Driver=Driver;
	}

	//locators
	By img=By.xpath("//a[normalize-space()='']//img");
	By Assign_leave=By.xpath("//tbody/tr/td[1]/div[1]/a[1]");
	By Leave_list=By.xpath("//a[@href='/index.php/leave/viewLeaveList']");
	By Time_Sheet=By.xpath("//tbody/tr/td[3]/div[1]/a[1]");


	//Action Methods

	public boolean img_Displayed() {
		boolean status=Driver.findElement(img).isDisplayed();
		return status;
	}

	public void Assign_leave() {

		Driver.findElement(Assign_leave).click();
	}
	
	public void leave_list() {
		
		Driver.findElement(Leave_list).click();
	}
	
	public void Time_Sheet() {
		
		Driver.findElement(Time_Sheet).click();
	}
	
	public void quit() {
		Driver.quit();
	}
}
