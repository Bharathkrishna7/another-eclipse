package com.PomAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationAction {
	
	WebDriver driver;
	public AutomationAction(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//li[@class]/a[text()='Dresses']")
	private WebElement dresses;
	@FindBy(xpath="//li[@class]/a[@title='Evening Dresses']")
	private WebElement evedress;
	
	
	public void clickaction() {
		
		Actions ac=new Actions(driver);
		ac.moveToElement(dresses).build().perform();
		ac.click(evedress);
		
	}
	

}
