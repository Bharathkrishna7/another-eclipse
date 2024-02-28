package com.PomAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsWithAlerts {

	WebDriver driver;

	public ActionsWithAlerts(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='SwitchTo']")
	private WebElement Switch;
	@FindBy(xpath = "//a[text()='Alerts']")
	private WebElement alert;

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement alertwithok;

	public void click() {
		Actions action = new Actions(driver);
		action.moveToElement(Switch).build().perform();
		alert.click();
	}

	public void switchtoalert() {
		alertwithok.click();
		Alert a=driver.switchTo().alert();
		a.accept();
	}

}
