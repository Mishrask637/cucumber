package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src\\test\\resources\\features\\uber.feature"},
		glue= {"stepdefinition"},
		tags= "@All",
		plugin= {"pretty"},
		monochrome = true
		)

public class UberTest {

}
