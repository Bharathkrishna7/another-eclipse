package stepDefinitions;

import com.pages.Flipkart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartSteps {

	Flipkart f;

	@Given("i open chrome browser")
	public void i_open_chrome_browser() {
		System.out.println("open chrome browser");

		f.openchrome();

	}

	@When("i enter {string} in search field and hit enter")
	public void i_enter_in_search_field_and_hit_enter(String name) {
		f = new Flipkart(name);
		f.enterdata(name);

	}

	@Then("validate mobiles on the header bar")
	public void validate_mobiles_on_the_header_bar() {

	}
}
