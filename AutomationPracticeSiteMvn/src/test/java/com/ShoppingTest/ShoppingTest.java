package com.ShoppingTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonPage.CartPage;
import com.ShoppingPages.Addbook;
import com.ShoppingPages.BillingPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShoppingTest {
	WebDriver driver;
	Addbook ab;
	BillingPage bp;
	CartPage cp;
	@BeforeMethod
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/shop/");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	@Test
	public void addData() {
		driver=new ChromeDriver();
		ab=new Addbook(driver);
		cp=new CartPage(driver);
		bp=new BillingPage(driver);
		ab.addtobaslet();
		cp.carts();
		bp.names("firstna", "lastna");
		
	}

}
