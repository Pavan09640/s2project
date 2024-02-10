package com.practice.seleniums2.listeners;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.practice.seleniums2.FacebookTest;

public class ListenerTest extends FacebookTest implements ITestListener{
	
	private ExtentReports extent;
    private ExtentTest test;
	
	

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	    captureScreenshot(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");
		
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        
	        try {
	            test = extent.createTest("Test Execution Report", "Environment Details");
	            test.info("Operating System: Windows 10");
	            test.info("Java Version: 1.8.0_201");
	            test.info("Host Name: " + InetAddress.getLocalHost().getHostName());
	            test.info("Browser: Chrome");
	        } catch (UnknownHostException e) {
	            e.printStackTrace();
	        }
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
		extent.flush();
	}

}
