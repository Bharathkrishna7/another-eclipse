package com.MyStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePages.TestBase;

public class CartPage extends TestBase {

	public CartPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title='Blouse']/../../../..")
	private WebElement blouse;
	@FindBy(xpath = "//span[text()='Add to cart']/..")
	private WebElement cart;
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement Checkout;
	@FindBy(xpath = "//a[@title='View my shopping cart']")
	private WebElement cartbox;

	public void mycart() {
		Actions action = new Actions(driver);
		action.moveToElement(blouse);
		blouse.click();
		cart.click();
		Checkout.click();
		
	}

	public String verifycart() {
		Actions action = new Actions(driver);
		action.moveToElement(cartbox);
		String actual = cartbox.getText();
		System.out.println(actual);

		return actual;

	}

}
