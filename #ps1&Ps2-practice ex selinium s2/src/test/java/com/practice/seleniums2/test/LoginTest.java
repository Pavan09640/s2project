package com.practice.seleniums2.test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.practice.seleniums2.BaseTest;
import com.practice.seleniums2.pages.LoginPage;


public class LoginTest extends BaseTest{
	
LoginPage lp;
	
	@BeforeClass
	public void openApp() {
		openBrowser("chrome");
		lp = new LoginPage(driver);
	}
	
	@Test
	public void loginUser() throws InterruptedException, IOException  {
		lp.click_login();
		Thread.sleep(2000);
		lp.enter_email();
		
//		lp.enter_password();
//		Thread.sleep(2000);
//		lp.click_loginBtn();
	}
	
	
	@AfterClass
	public void cleanUp() {
		driver.quit();
	}

}


