package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src\\test\\resources\\features\\search.feature"},
		glue= {"stepdefinition","hookspackage"},
		tags="@Smoke or @Regression" ,
		plugin= {"pretty",
				"json:target/MyReports/report.json",
				 "junit:target/MyReports/report.xml"},
		publish=true,
		monochrome = true,
		dryRun = true
		)



public class AmazonTest { 

}
