package com.goole.listenersdemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public  class TestNGListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		 

		  System.out.println("Testcases are onTestStart and details are " +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 

		  System.out.println("Testcases are onTestSuccess and details are " +result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		  System.out.println("Testcases are onTestFailure and details are " +result.getName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		  System.out.println("Testcases are skipped and details are " +result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 

		  System.out.println("Testcases are onTestFailedButWithinSuccessPercentage and details are " +result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {

		  System.out.println("Testcases are onstart and details are " +context.getName());
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		 

		  System.out.println("Testcases are onfinish and details are " +context.getName());
			
	}
	
	

}
