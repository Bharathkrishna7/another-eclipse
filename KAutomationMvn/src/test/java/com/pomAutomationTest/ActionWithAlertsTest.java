package com.pomAutomationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.PomAutomation.ActionsWithAlerts;

public class ActionWithAlertsTest {
	WebDriver driver;

	@Test
	@Parameters({ "url" })
    public void AutomationDemo(@Optional String url) {
		System.setProperty("webdriver.chrome.driver", "D:/Browser drivers/chromedriver_win32 99/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		ActionsWithAlerts aa = new ActionsWithAlerts(driver);
		aa.click();
		aa.switchtoalert();

	}

}
