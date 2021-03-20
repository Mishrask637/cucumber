package stepdefinition;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingSteps {

	int billingAmt;
	double taxAmt;
	double finalAmt;
	
	
	@Given("user is on billing page")
	public void user_is_on_billing_page() {
	   System.out.println("User is on Billing Page");
	}

	@When("user enters billing amount {string}")
	public void user_enters_billing_amount(String billingAmt) {
	 this.billingAmt=Integer.parseInt(billingAmt);
	}

	@When("user enters tax amount {string}")
	public void user_enters_tax_amount(String taxAmt) {
	   this.taxAmt=Double.parseDouble(taxAmt);
	   System.out.println("Tax Amount is "+taxAmt);
	}

	@When("user clicks on calculate tax button")
	public void user_clicks_on_calculate_tax_button() {
	  System.out.println("User clicks on calculate tax button");
	}

	@Then("it gives the final amount {string}")
	public void it_gives_the_final_amount(String finalAmt) {
	  this.finalAmt=this.billingAmt+this.taxAmt;
	  System.out.println("Expected Final Amount is "+finalAmt);
	  System.out.println("Actual Final Amount is "+this.finalAmt);
	  assertTrue(this.finalAmt==Double.parseDouble(finalAmt));
	}

	/*
	 * @When("user enters tax amount {double}") public void
	 * user_enters_tax_amount(Double taxAmt) { this.taxAmt=taxAmt;
	 * System.out.println("Tax Amount is "+taxAmt); }
	 */
	/*
	 * @Then("it gives the final amount {double}") public void
	 * it_gives_the_final_amount(Double finalAmt) {
	 * this.finalAmt=this.billingAmt+this.taxAmt;
	 * 
	 * assertTrue(this.finalAmt==finalAmt); }
	 */

	
}
