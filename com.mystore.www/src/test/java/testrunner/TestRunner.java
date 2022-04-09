package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\Features\\mystore.feature",
		glue = "steps",
		monochrome =true,
		tags = {"@End_To_End "},
		plugin= {"pretty","html:test-output"}
		)

public class TestRunner
{

}
