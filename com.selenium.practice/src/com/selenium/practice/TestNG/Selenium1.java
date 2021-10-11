package com.selenium.practice.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium1 {
	ChromeDriver Driver;
  @Test
   void login()
	 
	{
		
		System.setProperty("webdriver.chrome.driver","/Users/lalitha/Downloads/chromedriver");
		Driver=new ChromeDriver();
		Driver.get("https://facebook.com");
		}
  
  @Test
  void signin() {
	  Driver.findElement(By.id("email")).sendKeys("gopillaitha@gmail.com");
	  Driver.findElement(By.name("pass")).sendKeys("SAIRAM");
	  
  }

}
