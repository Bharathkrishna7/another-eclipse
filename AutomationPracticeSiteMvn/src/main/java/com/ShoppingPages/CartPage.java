package com.ShoppingPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@title='View your shopping cart']")
	private WebElement cartbutton;
	@FindBy(xpath = "//div[@class='wc-proceed-to-checkout']")
	private WebElement checkout;

	public void cart() {
		cartbutton.click();
	}
	
	public void Proceedcheckout() {
		checkout.click();
	}
	
	
}
