package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Map;

public class UserRegistrationSteps {

	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	   System.out.println("Step 1 :User Naigates Registration Page");
	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	
		List<List<String>> listData = dataTable.asLists(String.class);

		for(List<String> e:listData)
		{
			System.out.println("Data is "+e);
		}
		
	}

	
	@When("User enters following user details with columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   
		List<Map<String, String>> userList = dataTable.asMaps(String.class,String.class);
		
		System.out.println("User map is "+userList.get(0).get("First"));
		
		
		for(Map<String, String> e:userList)
		{
			System.out.println(e.get("First"));
			System.out.println(e.get("Last"));
			System.out.println(e.get("Email"));
			System.out.println(e.get("Mobile"));
			System.out.println(e.get("Location"));
		}
		
	}
	
	
	@Then("User registration should be successful")
	public void user_registration_should_be_successful() {
	   System.out.println("Step 3: User registration should be successful");
	}
	
}
