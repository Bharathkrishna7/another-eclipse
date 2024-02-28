package com.ShoppingPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addbook {
	WebDriver driver;

	public Addbook(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Add to basket']/..")
	private WebElement addbutton;

	public void addtobaslet() {
		addbutton.click();
	}

}
