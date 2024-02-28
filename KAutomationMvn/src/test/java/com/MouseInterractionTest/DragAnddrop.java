package com.MouseInterractionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAnddrop {
	static WebDriver driver;

	@BeforeMethod()

	public void openchrome() {
		System.setProperty("webdriver.chrome.driver", "D:/Browser drivers/chromedriver_win32 101/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}

	@Test()
	public void dragandDrop() {
		driver.get("http://demo.automationtesting.in/Register.html");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Interactions ']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Drag and Drop ']"))).perform();
		driver.findElement(By.xpath("//a[text()='Dynamic ']")).click();
	
		WebElement drag = driver.findElement(By.xpath("//img[@id='node']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droparea']"));
		
		action.clickAndHold(drag).moveToElement(drop).release().perform();
		
	}

	@AfterMethod()
	public void closebrowser() {
		// driver.close();
	}

}
