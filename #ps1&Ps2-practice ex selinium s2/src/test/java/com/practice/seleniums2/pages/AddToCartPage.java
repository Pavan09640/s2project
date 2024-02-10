package com.practice.seleniums2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.seleniums2.BaseTest;

public class AddToCartPage extends BaseTest{
	
	@FindBy(xpath="//li[@class='inactive']//a[@href='/books']")
	WebElement Books;
	
	@FindBy(xpath="//a[text()='Computing and Internet']")
	WebElement book;
	
	@FindBy(id="add-to-cart-button-13")
	WebElement addtocart;
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickBooks() throws InterruptedException {
		Books.click();
		Thread.sleep(2000);
		book.click();
	}
	
	public void addToCartBook() throws InterruptedException {
		addtocart.click();
	}
	

}
