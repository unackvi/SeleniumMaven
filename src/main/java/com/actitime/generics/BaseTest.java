package com.actitime.generics;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest implements AutoConstant{

	public WebDriver driver;
	
	// this parameter name will be accessed in testng.xml file
	@Parameters("browser")
	
	@BeforeClass
	public void openBrowser(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();		
		} else if(browser.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();			
		} else
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(url);
		Reporter.log("openBrowser method of Basetest class is executing", true);
		Thread.sleep(5000);
		
		}
	
	@AfterClass
	public void closeBrowser() {
		//driver.quit();
	}
	
	@BeforeMethod
	public void loginToApp() throws IOException {
		Reporter.log("@BeforeMethod: loginToApp of basetest class is executing", true);
		LoginPage login = new LoginPage(driver);
		login.loginMethod(driver);
	}
	
	@AfterMethod
	public void logoutOfApp() {
	//HomePage home = new HomePage(driver);
	//home.logoutMethod(driver);
	}
}
