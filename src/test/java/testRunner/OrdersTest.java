package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features= {"src\\test\\resources\\features\\order.feature"},
			glue= {"stepdefinition"},
			plugin= {"pretty"},
			monochrome = true
		)
public class OrdersTest {
	
}
