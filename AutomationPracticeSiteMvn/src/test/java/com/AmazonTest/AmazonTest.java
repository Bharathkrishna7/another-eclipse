package com.AmazonTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonPage.CartPage;
import com.AmazonPage.Shopingcart;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	WebDriver driver;
	CartPage pg;
	Shopingcart sc;

	@BeforeMethod
	public void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void amazon() {
		pg = new CartPage(driver);
		driver.get("https://amazon.in/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		pg.carts();
		// sc.delete();
	}

	@AfterMethod
	public void close() {
		// driver.close();
	}

}
