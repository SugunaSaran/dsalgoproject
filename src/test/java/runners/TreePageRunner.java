package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
@CucumberOptions(
		features = {"src/test/java/features"},
		dryRun = !true,
		glue= "stepdefinitions",
		snippets=SnippetType.CAMELCASE,
		monochrome=true
)

public class TreePageRunner extends AbstractTestNGCucumberTests{ 

}
