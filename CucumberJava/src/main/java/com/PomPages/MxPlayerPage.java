package com.PomPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MxPlayerPage {

	WebDriver driver;
	static Actions action;

	public MxPlayerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='WEB SHOWS']")
	WebElement webshowElement;
	@FindBy(xpath = "//div[@class='nav-submenu ']")
	WebElement WebshowSubelements;
	@FindBy(xpath = "//div[text()='Drama']")
	WebElement drama;
	@FindBy(xpath = "//div[text()='Thriller']")
	WebElement thriller;
	@FindBy(xpath = "//div[text()='Reality']")
	WebElement reality;
	@FindBy(xpath = "//div[text()='Crime']")
	WebElement crime;
	@FindBy(xpath = "//div[text()='Comedy']")
	WebElement comedy;

	public void Movetoelements() {

		action = new Actions(driver);
		action.moveToElement(webshowElement).build().perform();
	}

	public void Subelements() {
		action.moveToElement(WebshowSubelements).build().perform();
		List<WebElement> Selement = driver.findElements(By.xpath("nav-submenu "));
		for (WebElement se : Selement) {
			se.getSize();
			String sedata = se.getText();
			System.out.println("data in sub shows " + sedata);
		}
	}

	public void clickdrama() {
		action.moveToElement(WebshowSubelements).build().perform();
		drama.click();
	}

	public void clickthriller() {
		action.moveToElement(WebshowSubelements).build().perform();
		thriller.click();
	}

	public void clickreality() {
		action.moveToElement(WebshowSubelements).build().perform();
		reality.click();
	}

	public void clickcrime() {
		action.moveToElement(WebshowSubelements).build().perform();
		crime.click();
	}

	public void clickcomedy() {
		action.moveToElement(WebshowSubelements).build().perform();
		comedy.click();
	}

}
