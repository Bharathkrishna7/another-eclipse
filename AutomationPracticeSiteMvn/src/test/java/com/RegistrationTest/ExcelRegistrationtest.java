package com.RegistrationTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ExcelUtilits.ExcelTestUtil;

public class ExcelRegistrationtest {
	WebDriver driver;

	@BeforeMethod
	public void setupchrome() {
		System.setProperty("webdriver.chrome.driver", "D:/Browser drivers/chromedriver_win32 98/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(24, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(32, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	@DataProvider
	public Iterator<Object[]> getExcelTestdata() {
		ArrayList<Object[]> testdata=ExcelTestUtil.getDataFromExcel();
		return testdata.iterator();
	}

	@Test(dataProvider = "getExcelTestdata")
	public void excelRegData(String FirstName,String LastName,String Email,String PhoneNumber,String
			Password,String ConfirmPassword  ) {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(LastName);
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@type='tel']")).clear();
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(PhoneNumber);
		driver.findElement(By.xpath("//input[@id='firstpassword']")).clear();
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='secondpassword']")).clear();
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(ConfirmPassword);
	}
	@AfterMethod
	public void terdown() {
		driver.quit();
	}

}
