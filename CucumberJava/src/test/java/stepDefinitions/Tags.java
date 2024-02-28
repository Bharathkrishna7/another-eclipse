package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tags {
	
	@Given("enetr into chromebrowser")
	public void enetr_into_chromebrowser() {
	 System.out.println("browser open");
	}
	@When("Open amazon application")
	public void open_amazon_application() {
		System.out.println("amazon open");
	}
	@And("search for mobile")
	public void search_for_mobile() {

		System.out.println("samsung Zflip");
	}
	@Then("close the browser")
	public void close_the_browser() {
		System.out.println("close browser");
	}
	
	
	@Given("enetr into firefoxbrowser")
	public void enter_into_chromebrowser() {
	 System.out.println("browser open");
	}
	@When("Open flipkart application")
	public void amazon_application() {
		System.out.println("flipkart open");
	}
	@And("search for laptop")
	public void search_mobile() {

		System.out.println("samsung Zflip");
	}
	@Then("close browser")
	public void close_browser() {
		System.out.println("close browser");
	}	

}
