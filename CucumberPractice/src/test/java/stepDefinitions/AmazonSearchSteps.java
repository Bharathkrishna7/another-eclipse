package stepDefinitions;

import org.junit.Assert;

import com.pages.AmazonSearch;
import com.pages.Displaysearch;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearchSteps {

	AmazonSearch search;
	Displaysearch display;

	@Given("i have a search field on amazon page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("i am on search page");

	}

	@When("i search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String ProductName, Integer Price) {
		System.out.println("Searching for a product: " + ProductName + "and price " + Price);
		search = new AmazonSearch(ProductName, Price);
		
	}

	@Then("Product with name {string} should be display")
	public void product_with_name_should_be_display(String ProductName) {
		System.out.println("name of the product is " + ProductName);
		display = new Displaysearch();
		String name=display.displayproduct(search);
		System.out.println("search product is :"+name);
		Assert.assertEquals(search.getProductname(), name); 
	
	}

}
