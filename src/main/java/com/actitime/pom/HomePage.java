package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BasePageUtilities;


public class HomePage extends BasePageUtilities {
	@FindBy(id = "container_tasks")
	private WebElement tasksButton;

	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_settings ']//div[@class='menu_icon']")
	private WebElement settingsButtonLink;
	
	@FindBy(xpath="//a[contains(.,'Types of Work')]")
	private WebElement typesOfWorkLink;
	
	@FindBy(xpath="//a[contains(text(),'Leave Types')]")
	private WebElement LeaveTypesLink;
	
	
	// Initialization Phase, call the constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void logoutMethod(WebDriver driver) {
		jsClick(driver, logoutLink);
	}

	public void clickOnTasksMethod(WebDriver driver) {
		jsClick(driver, tasksButton);
	}
	
	public void clickOnSettingsLinkMethod(WebDriver driver) {
		jsClick(driver, settingsButtonLink);
	}
	 public void clickOnLeaveTypeLinkMethod(WebDriver driver) {
			jsClick(driver, typesOfWorkLink);
		 
	 }
	 public void clickOnTypeOfWorkLinkMethod(WebDriver driver) {
			jsClick(driver, LeaveTypesLink);
		 
	 }
}
