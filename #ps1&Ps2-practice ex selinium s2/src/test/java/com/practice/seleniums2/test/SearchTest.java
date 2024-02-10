package com.practice.seleniums2.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.practice.seleniums2.BaseTest;
import com.practice.seleniums2.pages.AddToCartPage;
import com.practice.seleniums2.pages.SearchPage;

public class SearchTest extends BaseTest{
	
	
SearchPage sp;
	
	@BeforeClass
	public void openApp() {
		openBrowser("chrome");
		sp = new SearchPage(driver);
	}
	
	@Test
	public void loginUser() throws InterruptedException  {
		sp.clickSearch();
		
		
	}
	
	
	@AfterClass
	public void cleanUp() {
		driver.quit();
	}

}
