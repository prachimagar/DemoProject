package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Feature//LoginDataTable.feature", 
				glue = "paraDefs", 
				dryRun = false, 
				publish = true, 
				monochrome = true, 
				stepNotifications = true, 
				plugin = {"pretty", "html:target/dataTableLogin.html" })


public class LoginDataRunner {

}
