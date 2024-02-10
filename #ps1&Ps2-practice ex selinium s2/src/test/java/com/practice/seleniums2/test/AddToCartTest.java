package com.practice.seleniums2.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.practice.seleniums2.BaseTest;
import com.practice.seleniums2.pages.AddToCartPage;

public class AddToCartTest extends BaseTest{
	
AddToCartPage ap;
	
	@BeforeClass
	public void openApp() {
		openBrowser("chrome");
		ap = new AddToCartPage(driver);
	}
	
	@Test
	public void loginUser() throws InterruptedException  {
		ap.clickBooks();
		ap.addToCartBook();
	}
	
	
	@AfterClass
	public void cleanUp() {
		driver.quit();
	}

}
