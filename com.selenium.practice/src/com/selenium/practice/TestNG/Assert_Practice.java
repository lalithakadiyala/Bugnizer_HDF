package com.selenium.practice.TestNG;

import org.testng.Assert;

import org.testng.annotations.*;
@Listeners(com.selenium.practice.TestNG.MyListener.class)
public class Assert_Practice {
	
	
	@Test(priority=1)
	void passedM(){
		Assert.assertEquals("ABC",  "ABC");
	}
	
	@Test(priority=2)
	void failedM() {
		Assert.assertEquals("ABC", "XYZ");
	}
	
	@Test(priority=3, dependsOnMethods={"failedM"})
	void skippedM() {
		Assert.assertEquals("jgc", "jhgd");
	}

}
