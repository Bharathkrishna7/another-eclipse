package com.ExcelDataPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePages.TestBase;

public class Registrationpage extends TestBase {
	public Registrationpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	@CacheLookup //This annotation will store the "Element RV" in Cache memory and speed up executions
	private WebElement firstname;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastname;
	@FindBy(xpath = "//input[@type='email']")
	private WebElement mail;
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement phone;
	@FindBy(xpath = "//input[@id='firstpassword']")
	private WebElement pswd;
	@FindBy(xpath = "//input[@id='secondpassword']")
	private WebElement confirmpwd;
	
	public void Regtxt(String fname, String lname, String email, String mobile) {

		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		mail.sendKeys(email);
		phone.sendKeys(mobile);
	}
	public void pwd(String pwd,String confpwd) {
		pswd.sendKeys(pwd);
		confirmpwd.sendKeys(confpwd);
	}

}
