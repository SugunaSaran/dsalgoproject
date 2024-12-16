package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

public class TestRunnerStackPage {
	@RunWith(Cucumber.class)

	@CucumberOptions(
			features= {"src/test/resources/Array/arrayPage.feature"},
			dryRun = true,
			glue= "stepdefinitions",
			//snippets=SnippetType.CAMELCASE,
			monochrome=true,
			tags="@Array"

			)




			public class Runner extends AbstractTestNGCucumberTests {
				

			}


}
