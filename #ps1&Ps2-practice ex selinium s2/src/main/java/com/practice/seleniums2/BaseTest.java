package com.practice.seleniums2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
public static WebDriver driver;
	
	public static void openBrowser(String browser) {
		if(browser=="chrome") {
			driver = new ChromeDriver();
		}
		
		if(browser=="Firefox") {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demowebshop.tricentis.com/");
	}

}
