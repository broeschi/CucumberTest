package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="resources/features/DataDrivenTests.feature",
		glue="stepDefinitions"
		)
	
public class TestRunner_DataDrivenTests {

}
