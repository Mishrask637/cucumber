package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class uberdefinition {

	@Given("User wants to select a cab type {string} from uber app")
	public void user_wants_to_select_a_cab_type_from_uber_app(String car) {
	   System.out.println("Step 1 : User wants to select a cab type "+car+" from uber app");
	}

	@When("User selects car {string} and  pickup point {string} and drop location {string}")
	public void user_selects_car_and_pickup_point_and_drop_location(String car, String sloc, String dloc) {
		 System.out.println("User selects car "+car+" and  pickup point "+sloc+" and drop location "+dloc+"");
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		 System.out.println("Driver starts the journey");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Driver ends the journey");
	}

	@Then("user pays {int} USD")
	public void user_pays_usd(Integer price) {
		System.out.println("user pays "+price+" USD");
	}
	
}
