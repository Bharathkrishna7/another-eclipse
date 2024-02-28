package com.RegistrationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BasePages.TestBase;

public class Registration extends TestBase {

	public Registration() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastname;
	@FindBy(xpath = "//input[@type='email']")
	private WebElement mail;
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement phone;
	@FindBy(xpath ="//input[@value='Male']")
	private WebElement radio;
	@FindBy(xpath = "//input[@value='FeMale']")
	private WebElement fradio;
	@FindBy(xpath = "//input[@value='Movies']")
	private WebElement check;
	@FindBy(xpath = "//input[@value='Hockey']")
	private WebElement Hcheck;
	@FindBy(xpath = "//div[@id='msdd']")
	private WebElement language;
	@FindBy(xpath="//select[@id='Skills']")
	private WebElement Skddown;
	@FindBy(xpath="//span[@role='combobox']")
	private WebElement COddown;
	@FindBy(xpath="//select[@placeholder='Year']")
	private WebElement Yddown;
	@FindBy(xpath = "//select[@placeholder='Month']")
	private WebElement Mddown;
	@FindBy(xpath = "//select[@placeholder='Day']")
	private WebElement Dddown;
    @FindBy(xpath = "//input[@id='firstpassword']")
	private WebElement pswd;
	@FindBy(xpath = "//input[@id='secondpassword']")
	private WebElement confirmpwd;
	@FindBy(xpath = "//button[text()='Refresh']")
	private WebElement button;

	public void registrationtxt(String fname, String lname, String email, String mobile) {

		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		mail.sendKeys(email);
		phone.sendKeys(mobile);
	}
	
	public void radiobutton() {
		radio.click();
	}
	
	public void rbutton() {
		fradio.click();
	}
	
	public void checkbox() {
		check.click();
	}
	
	public void Hcheckbox() {
		Hcheck.click();
	}
	
	public void Language(String lang) {
		language.sendKeys(lang);
	}
	
	
	public void ddownS() {
		Select drop=new Select(Skddown);
		drop.selectByValue("Android");
	}
	
	public void skilldown() {
		Select drop=new Select(Skddown);
		drop.selectByValue("APIs");
	}
	
	public void ddownC() {
		COddown.click();
		driver.findElement(By.xpath("//li[contains(text(),'Netherlands')]")).click();
	}
	
	public void ddownDOB() {
		Select dropdob=new Select(Yddown);
		dropdob.selectByValue("1994");
		Select dropdob2=new Select(Mddown);
		dropdob2.selectByValue("June");
		Select dropdob3=new Select(Dddown);
		dropdob3.selectByValue("7");
	}
	
	public void pass(String pwd,String confpwd) {
		pswd.sendKeys(pwd);
		confirmpwd.sendKeys(confpwd);
	}

	public void refresh() {
		button.click();
	}

}