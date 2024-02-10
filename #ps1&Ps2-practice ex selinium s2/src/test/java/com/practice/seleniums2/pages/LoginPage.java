package com.practice.seleniums2.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.seleniums2.BaseTest;
import com.practice.seleniums2.utilities.XLUtility;

public class LoginPage extends BaseTest{
	
	String path = "\\testdata\\loginData.xlsx";
	
	
	
	//XLUtility xlutil = new XLUtility(path);
	
	 XSSFCell cell;
	 
	 XSSFWorkbook workbook;
	 XSSFSheet sheet;
	 
	 
	
	@FindBy(xpath="//a[text()='Log in']")
	WebElement login;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[@class='ico-logout']")
	WebElement logout;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void click_login() {
		login.click();
	}
	
	public void enter_email() throws IOException, InterruptedException {

		String expectedUrl="https://demowebshop.tricentis.com/";
		
		File src = new File("testdata\\copy of TestData(1).xlsx");

		// Load the file as FileInputStream.
		FileInputStream fileInput = new FileInputStream(src);

		// Load the workbook
		workbook = new XSSFWorkbook(fileInput);
		
		sheet = workbook.getSheetAt(0);
		
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			//for(int j=0;j<colcount;j++) {
			cell = sheet.getRow(i).getCell(0);
			cell.setCellType(CellType.STRING);
				email.sendKeys(cell.getStringCellValue());
				
				cell = sheet.getRow(i).getCell(1);
				cell.setCellType(CellType.STRING);
				
				password.sendKeys(cell.getStringCellValue());
				
				loginBtn.click();
				
					
					//logout.click();
					//Thread.sleep(1000);
					//login.click();
					
				
				Thread.sleep(1000);
				email.clear();
				Thread.sleep(1000);
				password.clear();
			
				
               FileOutputStream foutput=new FileOutputStream(src);
				
				// Specify the message needs to be written.
                    String message = "invalid";
				
				
               
            	   
   				
   				//Create cell where data needs to be written.
   				sheet.getRow(i).createCell(2).setCellValue(message);
            	   
               
				// Specify the file in which data needs to be written.
				FileOutputStream fileOutput =new FileOutputStream(src);
				
				//write content
				workbook.write(fileOutput);
				
				  // close the file
				fileOutput.close();
		}
		}
			
		
		
	
	
	public void enter_password() {
		
	}
	
	public void click_loginBtn() {
		
	}

}
