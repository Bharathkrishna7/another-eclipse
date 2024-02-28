package com.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
	WebDriver driver;

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//Select[@id='id_contact']")
	WebElement dropdown;

	@FindBy(xpath = "//input[@name='from']")
	WebElement emailaddress;

	@FindBy(xpath = "//input[@id='id_order']")
	WebElement Orderref;

	@FindBy(xpath = "//div[@class='uploader']")
	WebElement choosefile;

	@FindBy(xpath = "//textarea[@id='message']")
	WebElement Message;

	public void Ddown() {
		Select select = new Select(dropdown);
		select.selectByVisibleText("Webmaster");
	}
	
	public void addData(String email,String  orderRef) {
		emailaddress.sendKeys(email);
		Orderref.sendKeys(orderRef);
	}

	public void Fileupload() {

		choosefile.sendKeys("C:\\Users\\Gowtham Krishna\\Desktop.txt");
		
	}
	
	public void addmessage(String message) {
		Message.sendKeys(message);
	}
	

}
