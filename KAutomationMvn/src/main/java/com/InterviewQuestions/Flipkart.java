package com.InterviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	WebDriver driver;

	public void chromebrowserLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:/Browser drivers/chromedriver_win32 99/chromedriver.exe");

		driver = new ChromeDriver();

	}

	public void flipkart() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("input._3704LK")).sendKeys("iphone");
		driver.findElement(By.cssSelector("input._3704LK")).submit();// We can use "submit" As an "ENTER KEY".
		// driver.switchTo().frame(driver.findElement(By.xpath("//button[text()='✕']"))).close();
		// driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	}

	public static void main(String[] args) {
		Flipkart f = new Flipkart();
		f.chromebrowserLaunch();
		f.flipkart();
	}

}
