package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public String name;

	public Flipkart(String name) {
		this.name = name;
	}

	WebDriver driver = new ChromeDriver();

	public void openchrome() {
		driver.get("https://www.flipkart.com/");

	}

	public void enterdata(String name) {

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys(name);

	}

}
