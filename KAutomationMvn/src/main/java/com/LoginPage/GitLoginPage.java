package com.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitLoginPage {
	
	WebDriver driver;
	
	public GitLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="login_field")
	private WebElement lgn_fld;
	
	@FindBy(name="password")
	private WebElement pass_fld;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement login_button;
	
	
	public void gitlogin(String user,String pass) {
		lgn_fld.clear();
		lgn_fld.sendKeys(user);
		pass_fld.clear();
		pass_fld.sendKeys(pass);
		login_button.click();
		
		
	}
}
