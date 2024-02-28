package com.LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import utils.ConfigReader;

public class BaseTest {
	ConfigReader cfgreader;
	public static WebDriver driver;
	
	@BeforeSuite
	public void init() {
		cfgreader=new ConfigReader();
		cfgreader.readconfig();
		cfgreader.readinput();
	}
	

	@BeforeTest
	public void launchbrowser() {
		openChromeBrowser();
		driver.get(cfgreader.geturl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public static void openChromeBrowser() {
	//System.setProperty("webdriver.chrome.driver", IConstants.chromeDriverPath);
	System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\chromedriver_win32 99.chromedriver.exe");
		
	    driver = new ChromeDriver();
		
	}
	
	@AfterTest
	public void quit() {
		//driver.quit();
	}

}
