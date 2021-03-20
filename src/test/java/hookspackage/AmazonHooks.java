package hookspackage;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {

	@Before("@Smoke")
	public void setup_Browser(Scenario sc)
	{
		System.out.println("Launch chrome browser");
		System.out.println("Scenario Name is "+sc.getName());
	}
	
	
	/*
	 * @Before(order = 2) public void setup_URL() {
	 * System.out.println("Launch URL"); }
	 * 
	 * @After(order=2) public void teardown_close(Scenario sc) {
	 * System.out.println("Close the browser");
	 * System.out.println("Scenario Name is "+sc.getName()); }
	 */
	
	@After("@Smoke")
	public void teardown_logout()
	{
		System.out.println("Logout Application");
	}
	
	
	
	/*
	 * @BeforeStep public void takescreenshot() {
	 * System.out.println("Take screenshot"); }
	 * 
	 * @AfterStep public void refresh() { System.out.println("Refresh Page"); }
	 */
	
}
