package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

	@Given("user is on application landing page")
	public void user_is_on_application_landing_page() {
	    
	}

	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
	  
	}

	@Then("user is displayed login screen")
	public void user_is_displayed_login_screen() {
	   
	}

	@When("user enters {string} in username field")
	public void user_enters_in_username_field(String string) {
	   
	}

	@When("user enters {string} in passord field")
	public void user_enters_in_passord_field(String string) {
	  
	}

	@Then("user gets login failed error")
	public void user_gets_login_failed_error() {
	    
	}
	
}
