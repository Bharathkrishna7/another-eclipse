package com.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationLogin {
	
      WebDriver driver;
      public AutomationLogin(WebDriver driver) {
    	  this.driver=driver;
    	  PageFactory.initElements(driver, this);
      }

	@FindBy(xpath = "//input[@name='email'][@id='email']")
	WebElement email_fld;
	@FindBy(name = "passwd")
	WebElement pwd_fld;
	@FindBy(xpath = "//button[@name='SubmitLogin']")
	WebElement login_button;

	public void login(String Emailaddress, String Password) {
		email_fld.sendKeys(Emailaddress);
		pwd_fld.sendKeys(Password);
		login_button.click();
	}

}
