package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.ExcelLibrary;


public class LoginPage extends com.actitime.generics.BasePageUtilities {
	// declaration phase
	@FindBy(id = "username")
	private WebElement usernameTextBox;

	@FindBy(name = "pwd")
	private WebElement passwordTextBox;

	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement loginButton;

	// initialization phase
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// utilization phase
	public void loginMethod(WebDriver driver) throws IOException {
		int row = 1; 
		int cell = 1;// looking at excel sheet where the login value is
		usernameTextBox.sendKeys(ExcelLibrary.getCellValue(row, cell));
		row = 2;
		cell = 1;
		passwordTextBox.sendKeys(ExcelLibrary.getCellValue(row, cell));
		jsClick(driver, loginButton);
	}
}
