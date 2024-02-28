package com.pracTofindAns;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BasePages.TestBase;

public class Dropdown extends TestBase {
	
	public Dropdown() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='Skills']")
	private WebElement Skddown;

	@FindBy(xpath="//span[@role='combobox']")
	private WebElement COddown;
	@FindBy(xpath ="///li[contains(text(),'Netherlands')]/..")  
	private WebElement COddown1;
	
	@FindBy(xpath = "//div[@id='msdd']")
	private WebElement language;
	@FindBy(xpath="//select[@placeholder='Year']")
	private WebElement Yddown;
	@FindBy(xpath = "//select[@placeholder='Month']")
	private WebElement Mddown;
	@FindBy(xpath = "//select[@placeholder='Day']")
	private WebElement Dddown;
	
	public void ddownS() {
		Select drop=new Select(Skddown);
		//drop.selectByValue("Android");
		List<WebElement> lido=drop.getOptions();
		int siz=lido.size();
		System.out.println("Total num of skills are="+siz);
		for(int i=0;i<=lido.size()-1;i++) {
			String dropoptions=lido.get(i).getText();
			System.out.println(dropoptions);
		}
	}
	//Enhanced for loop
	/*	for(WebElement drdo:Doptions) {
			String text=drdo.getText();
		System.out.println(text);	
		}*/
	
	
	public void ddownC() {
		COddown.click();
	//	COddown1.click();
	  }
	public void ddownC1() {
	COddown1.click();
	  }
	
	
	public void Language(String lang) {
	//	ExpectedConditions.elementToBeClickable(language);
		language.sendKeys(lang);
		
	}
	public void ddownDOB() {
		Select dropdob=new Select(Yddown);
		dropdob.selectByValue("1994");
		Select dropdob2=new Select(Mddown);
		dropdob2.selectByValue("June");
		Select dropdob3=new Select(Dddown);
		dropdob3.selectByValue("7");
	}

}
