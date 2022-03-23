package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications = true,
		features= "src/test/resources/appFeatures/Uber.feature",
		glue= {"stepDefinations","myHooks"},
		tags="@Regression or @Smoke",
		plugin= {"pretty"}
				)
public class UberTest {


}
