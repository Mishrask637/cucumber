package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src\\test\\resources\\features\\registration.feature"},
		glue= {"stepdefinition"},
		//tags="@Smoke or @Regression" ,
		plugin= {"pretty",
				"json:target/MyReports/report.json",
				 "junit:target/MyReports/report.xml"},
		publish=true,
		monochrome = true
		//dryRun = true
		)

public class UserRegTest {

}
