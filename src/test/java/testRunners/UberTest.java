package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications = true,
		features= "src/test/resources/appFeatures/Uber.feature",
		glue= {"stepDefinations","myHooks"},
		tags="",
		plugin= {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/reports.xml",
				}
				)
public class UberTest {


}
