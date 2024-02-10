package com.practice.seleniums2;

import static com.practice.seleniums2.FacebookTest.driver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.practice.seleniums2.listeners.ListenerTest;

@Listeners({ListenerTest.class})
public class FacebookTest {
	
	static WebDriver driver;
	String siteUrl="https://www.facebook.com/";
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(siteUrl);
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("sasidhar@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sasi123");
		driver.findElement(By.xpath("//button[@name='login']")).click();;
		
		String expectedUrl = "Facebook – log in or sign up";
		String actualUrl = driver.getTitle();
		
		System.out.println(actualUrl);
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	
	@Test
	public void loginFailTest() {
		driver.findElement(By.id("email")).sendKeys("sasidhar@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sasi123");
		driver.findElement(By.xpath("//button[@name='login']")).click();;
		
		String expectedUrl = "Facebook – log in or sign up";
		String actualUrl = driver.getTitle();
		
		System.out.println(actualUrl);
		
		Assert.assertNotEquals(actualUrl, expectedUrl);
		
	}
	
	public void captureScreenshot(String testName) {
		
		TakesScreenshot takesscreenshot = (TakesScreenshot) driver;
		File file = takesscreenshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./Screenshots/"+testName+".png");
		
		try {
			FileUtils.copyFile(file, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
