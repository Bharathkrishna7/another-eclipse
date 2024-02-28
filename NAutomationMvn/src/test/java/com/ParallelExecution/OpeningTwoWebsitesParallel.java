package com.ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpeningTwoWebsitesParallel {
	WebDriver driver;
	@Test
	public void amazon() {
		System.setProperty("webdriver.chrome.driver", "D:/Browser drivers/chromedriver_win32 99/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void flipkart() {
		System.setProperty("webdriver.chrome.driver", "D:/Browser drivers/chromedriver_win32 99/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	}

}
