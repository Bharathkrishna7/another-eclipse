package com.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePages.TestBase;

public class GitSignOutPage extends TestBase {
		
	 public GitSignOutPage() {
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
