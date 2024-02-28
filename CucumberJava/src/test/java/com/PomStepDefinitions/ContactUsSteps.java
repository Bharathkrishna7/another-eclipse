package com.PomStepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PomPages.ContactUsPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactUsSteps {
	WebDriver driver;
	ContactUsPage page;

	@Given("open browser with url")
	public void open_browser_with_url() {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver", "D:/Browser
		// drivers/chromedriver_win32 101/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}

	@And("click on contact us button")
	public void click_on_contact_us_button() {
		driver.findElement(By.xpath("//a[text()='Contact us']")).click();
	}

	@And("choose WebMaster from subject handling dropdown")
	public void choose_web_master_from_subject_handling_dropdown() {
		page = new ContactUsPage(driver);
		page.Ddown();
	}

	@When("^Add (.*) and (.*)$")
	public void add_email_order(String email, String orderRef) {
		page.addData(email, orderRef);
	}

	@And("choose a file")
	public void choose_a_file() {
		page.Fileupload();
	}

	@And("^enter a (.*) and click on send button$")
	public void enter_data_and_click_on_send_button(String message) {
		page.addmessage(message);
	}

	@Then("refresh the page")
	public void refresh_the_page() {
		driver.navigate().refresh();
	}

}
