package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class LogindataSteps {
	WebDriver driver;

	@Given("opens browser")
	public void user_opens_browser() {
		WebDriverManager drive= new ChromeDriverManager();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

	}

	@And("Enters in login page")
	public void user_is_on_login_page() {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("^Enters (.*) and (.*)$") // ^ SymbolName : Cap
	public void user_enters_user_name_and_password(String userName, String password ) {
		driver.findElement(By.xpath("//input[@name='email'][@id='email']")).sendKeys(userName);
		driver.findElement(By.name("passwd")).sendKeys(password);

	}

	@And("clicked on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@name='SubmitLogin']")).sendKeys(Keys.ENTER);
	}

	@Then("Navigated to homepage")
	public void user_is_navigated_to_homepage() {
		driver.findElement(By.xpath("//h1[text()='My account']/..")).isDisplayed();

	}

}
