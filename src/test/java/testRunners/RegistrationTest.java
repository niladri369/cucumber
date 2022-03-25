package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications = true,
		features= "src/test/resources/appFeatures/Registration.feature",
		glue= {"stepDefinations"},
		tags="",
		plugin= {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/reports.xml",
				}
				)
public class RegistrationTest {

}
