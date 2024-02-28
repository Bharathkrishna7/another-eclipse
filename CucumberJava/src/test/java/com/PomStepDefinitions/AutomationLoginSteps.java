package com.PomStepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PomPages.AtomationHome;
import com.PomPages.AutomationLogin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationLoginSteps {
	WebDriver driver;
	AtomationHome home;
	AutomationLogin getin;

	@Given("Open chromebrowser with url")
	public void open_chromebrowser_with_url() {
		System.setProperty("webdriver.chrome.driver", "D:/Browser drivers/chromedriver_win32 101/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");

	}

	@And("Click on sign in button to reach loginPage")
	public void click_on_sign_in_button_to_reach_login_page() {
		home = new AtomationHome(driver);
		home.signin();
	}

	@When("^Enter valid (.*) and (.*)$")
	public void enter_valid_emailaddress_and(String Emailaddress, String Password) {
		getin = new AutomationLogin(driver);
		getin.login(Emailaddress, Password);
	}

	@Then("It navigates to My Account Page")
	public void it_navigates_to_my_account_page() {
		driver.findElement(By.xpath("//h1[text()='My account']/..")).isDisplayed();
	}

}
