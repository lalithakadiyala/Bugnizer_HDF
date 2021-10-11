package com.selenium.practice.TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{
	
	public void onTestStart(ITestResult Result) {
		System.out.println("My test is passed :" +Result);
		
	}
public void onTestSuccess(ITestResult Result) {
	System.out.println("My test is Failed" +Result);
}
	
	public void onTestFailure(ITestResult Result) {
		System.out.println("My test is Failed: " +Result);
	}
	
	public void onTestSkipped(ITestResult Result) {
		System.out.println("My Test is Skipped: "  +Result);
	}
	
		
		
		
		
	
	

}
