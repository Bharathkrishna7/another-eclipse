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

public class GoogleSearchSteps {
	
	WebDriver driver;
	
	@Given("Browser is open")
	public void browser_is_open() {
		/*System.setProperty("webdriver.chrome.driver","C:/Users/Gowtham Krishna/eclipse-work"
//				+ "space2021-06/CucumberJava/src/test/resources/drivers/chromedriver.exe");*/
//	System.setProperty("webdriver.chrome.driver", "D:/Browser drivers/chromedriver_win32 101/chromedriver.exe");
		WebDriverManager.chromedriver();
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@And("User is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("http://google.com");	 
	}

	@When("User enter  text in search field")
	public void user_enter_text_in_search_field() {
      driver.findElement(By.name("q")).sendKeys("Selenium");
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER); //or click
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	driver.getPageSource().contains("Downloads"); //This line verifies is it contains or not..
	driver.close();
	}

}
