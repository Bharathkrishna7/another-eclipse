package com.ShoppingPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage {
	WebDriver driver;

	String firstname="bharath";
	String lastname="krishna";
	
	public BillingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='billing_first_name']")
	private WebElement fname;
	@FindBy(xpath = "//input[@id='billing_last_name']")
	private WebElement lname;
	@FindBy(xpath = "//input[@id='billing_email']")
	private WebElement email;
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement phone;
	@FindBy(xpath = "//div[@id='s2id_billing_country']")
	private WebElement Country;
	@FindBy(xpath = "//input[@id='billing_address_1']")
	private WebElement Address;
	@FindBy(xpath = "//input[@id='billing_city']")
	private WebElement town;
	@FindBy(xpath = "//input[@id='billing_postcode']")
	private WebElement Zip;
	@FindBy(xpath = "//input[@id='payment_method_cod']")
	private WebElement CashOndel;
	@FindBy(xpath = "//input[@id='place_order']")
	private WebElement placeorder;
	
	public void names(String firstna,String lastna) {
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
	}
	
	
	
	
}
