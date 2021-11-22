package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features=".//Feature/Parameter.feature",
			glue="paraDefs",
			dryRun=false,
			monochrome=true,
			stepNotifications=true,
			publish=true,
			plugin= {"pretty","html:target/Parameter.html"})
public class ParaRunner {

	
}
