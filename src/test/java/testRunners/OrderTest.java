package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications = true,
		features= "src/test/resources/appFeatures/Order.feature",
		glue= {"stepDefinations"},
		
		plugin= {"pretty"}
				)
public class OrderTest {

}
