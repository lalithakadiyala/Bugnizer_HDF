package com.selenium.practice.TestNG;

import org.testng.annotations.*;


public class Annotations_All {
	
	
	@BeforeMethod
	
	void signin()
	{
		System.out.println("This is Before Method ");
	}
	
	@AfterMethod
	
	void signoff() {
		System.out.println("This is AfterMEthod");
	}
	
	@Test(priority=2)
	
	void search() {
		System.out.println("This is Test1");
	  }
	
	@Test(priority=1)
	
	void tapSearch() {
		System.out.println("This is  Test2");
	}
	
	@BeforeClass
	
	void login() {
		System.out.println("This is Before Class");
		
	}
	
	@AfterClass
	
	void logoff() {
		
		System.out.println("This is AfterClass");
	}
	
	@BeforeTest
	
     void Entry() {
		
		System.out.println("This is BeforeTest");
	}
	
	
	@AfterTest
	
	
	void exit() {
		System.out.println("This is AfterTest");
	}
	
	
	
	
	
	}
