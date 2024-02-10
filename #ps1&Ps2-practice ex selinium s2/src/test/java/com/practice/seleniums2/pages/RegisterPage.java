package com.practice.seleniums2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.seleniums2.BaseTest;



public class RegisterPage extends BaseTest{
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register;
	
	@FindBy(id="gender-male")
	WebElement gender;
	
	@FindBy(id="FirstName")
	WebElement firstName;
	
	@FindBy(id="LastName")
	WebElement lastName;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="register-button")
	WebElement registerBtn;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPassword;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void click_register() {
		register.click();
	}
	
	public void click_gender() {
		gender.click();
	}
	public void enter_firstName() {
		firstName.sendKeys("Sasi");
	}
	
	public void enterLastName() {
		lastName.sendKeys("Dhar");
	}
	
	public void enterEmail() {
		email.sendKeys("demo598@gmail.com");
	}
	
	public void enterPassword() {
		password.sendKeys("demo123");
	}
	
	public void enterConfirmPassword() {
		confirmPassword.sendKeys("demo123");
	}
	
	public void click_registerBtn() {
		registerBtn.click();
	}
	
	

}
