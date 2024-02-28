package com.BasePages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeSuite
	public static void init() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/C"
					+ "onfig/Config.Properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@BeforeTest
	public static void launchbrowser() {
		openChromeBrowser();
		driver.get(prop.getProperty("Regurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}
	
	public static void openChromeBrowser() {
	//System.setProperty("webdriver.chrome.driver", IConstants.chromeDriverPath);
	System.setProperty("webdriver.chrome.driver", "D:\\Browser drivers\\chromedriver_win32 98.chromedriver.exe");
		
	    driver = new ChromeDriver();
		
	}
	
	@AfterTest
	public void quit() {
		driver.quit();
	}

}
