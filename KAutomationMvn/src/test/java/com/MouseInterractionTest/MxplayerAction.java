package com.MouseInterractionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MxplayerAction {
	static WebDriver driver;

	@BeforeMethod()

	public void openchrome() {
		System.setProperty("webdriver.chrome.driver", "D:/Browser drivers/chromedriver_win32 101/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}



	@Test
	public void mxpalyertest() throws InterruptedException  {
        driver.get("https://www.mxplayer.in/");
        driver.findElement(By.xpath("//span[@class='language-dismiss']")).click();
        driver.findElement(By.xpath("//div[text()='GOT IT']")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(
				By.xpath("//div[@class='homepage-tab-headers inline-middle']//div[text()='WEB SHOWS']"))).build()
				.perform();
// 	action.moveToElement(driver.findElement(By.xpath("//div[@class='nav-submenu ']/../.."))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='WEB SHOWS']/../..//div[text()='Thriller']")).click();
		String Actual="Thriller Shows";
		Assert.assertEquals(Actual, "Thriller Shows");
	}
		
	@AfterMethod()
		public void closebrowser() {
		//driver.close();
		}
		
	}


