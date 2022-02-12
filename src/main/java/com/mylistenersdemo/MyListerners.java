package com.mylistenersdemo;

import org.testng.ITestListener;

public class MyListerners implements ITestListener{
	
	public void onStart() {
		System.out.println("On Start");
	}
	
	public void onFinish() {
		System.out.println("On Finish");
	}
	
	public void onTestStart() {
		System.out.println("On Test Start");
		
	}
	
	public void onTestSuccess() {
		System.out.println("On Test Success");
	}
	
	
	public void onTestFailure() {
		System.out.println("On Test Fail");
		
	}
	

	public void onTestSkipped() {
		System.out.println("On Test Skipped");
		
	}

}
