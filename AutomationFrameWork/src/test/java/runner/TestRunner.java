package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features=".//Feature/Login.feature",
			glue="stepDefs",
			dryRun=false,
			monochrome=true,
			stepNotifications=true,
			publish=true,
			plugin= {"pretty","html:target/loginTest.html"})
public class TestRunner {

	
}
