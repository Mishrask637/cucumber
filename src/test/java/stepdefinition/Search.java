package stepdefinition;

import implementation.Product;
import implementation.SearchProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

	Product product;
	SearchProduct search;
	@Given("I have a search filed on Amazon page")
	public void i_have_a_search_filed_on_amazon_page() {
	   System.out.println("Step 1");
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer productPrice) {
		System.out.println("Step 2: I search for Product name "+productName+" with price "+productPrice);
		
		product = new Product(productName,productPrice);
	}

	@Then("Product with name {string} should be displayed")	
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3");
		
		search = new SearchProduct();
		
		String productname = search.displayProduct(product);
	
		System.out.println("Search Product is "+productname);
	}
	
}
