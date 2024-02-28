package com.MukeshTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utils.TestUtil;

public class WebTable {

	WebDriver driver;

	@Test
	public void verifytable() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/Browser drivers/chromedriver_win32 101/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");

		List<WebElement> Ttable = driver.findElements(By.xpath("//table[contains(@id, 'customers')]//th"));

		int size = Ttable.size();
		System.out.println("Total count is " + size);

		for (int i = 0; i <= size - 1; i++) {
			String Tablehead = Ttable.get(i).getText();
			System.out.println(Tablehead);
		}
		Assert.assertEquals(size, 5, "Total size 5");

		List<WebElement> Tdata = driver.findElements(By.xpath("//table[contains(@id, 'customers')]//td"));
		System.out.println("size of tdata " + Tdata.size());

		boolean datastatus = false;

		for (int i = 0; i < Tdata.size() - 1; i++) {
			String data = Tdata.get(i).getText();
			System.out.println(data);

			if (data.contains("Amazon")) {
				datastatus = true;
				break;
			}
		}
		Assert.assertTrue(datastatus, "It contains in the table");

		WebElement name = driver.findElement(By.xpath("//table[contains(@id, 'customers')]//tr[3]//td[2]"));
		System.out.println("Name in the table is " + name.getText());

		driver.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td//input")).click();

		driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td//a")).click();

		Thread.sleep(5000);

		driver.navigate().back();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//table[contains(@id, 'customers')]//tr[3]//td[5]")).click();

		driver.quit();

	}

}
