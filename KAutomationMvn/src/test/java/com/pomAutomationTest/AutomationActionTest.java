package com.pomAutomationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.PomAutomation.AutomationAction;

public class AutomationActionTest {
	WebDriver driver;

	@Test
	public void Autoaction() {
		System.setProperty("webdriver.chrome.driver", "D:/Browser drivers/chromedriver_win32 99/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		AutomationAction aa = new AutomationAction(driver);
		aa.clickaction();

	}

}
