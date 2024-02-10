package com.practice.seleniums2.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.practice.seleniums2.BaseTest;
import com.practice.seleniums2.pages.RegisterPage;


public class RegisterTest extends BaseTest{
	
	RegisterPage rp;
	
	@BeforeClass
	public void openApp() {
		openBrowser("chrome");
		rp = new RegisterPage(driver);
	}
	
	@Test
	public void registerUser() throws InterruptedException {
		rp.click_register();
		Thread.sleep(2000);
		rp.click_gender();
		
		rp.enter_firstName();
		
		rp.enterLastName();
		
		rp.enterEmail();
		
		rp.enterPassword();
		
		rp.enterConfirmPassword();
		
		Thread.sleep(2000);
		
		rp.click_registerBtn();
	}
	
	
	@AfterClass
	public void cleanUp() {
		driver.quit();
	}

}
