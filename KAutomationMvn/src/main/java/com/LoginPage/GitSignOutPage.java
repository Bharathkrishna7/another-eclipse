package com.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitSignOutPage {
	

 WebDriver driver;
	
	 public GitSignOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='dropdown-caret']/../img")
	private WebElement button;
	
	@FindBy(xpath="//button[@class='dropdown-item dropdown-signout']")
	private WebElement signout;
	
	public void click() {
		button.click();
	}
	
	public void outbutton() {
		signout.click();
	}
	
}
