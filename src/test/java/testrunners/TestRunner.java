package testrunners;

import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/bharathi.html"}, //reporting purpose
			monochrome=false,  //console output color
			tags = "@tag or @leaveScenario", //tags from feature file
			features = {"src/test/resources/features"}, //location of feature files
			glue= {"src/test/java/stepdefinitions"}) //location of step definition files

public class TestRunner {

}
