package com.practice.seleniums2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.seleniums2.BaseTest;

public class SearchPage extends BaseTest{
	
	
	@FindBy(id="small-searchterms")
	WebElement search;
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSearch() {
		search.sendKeys("Mobiles");
		search.submit();
		
	}

}
