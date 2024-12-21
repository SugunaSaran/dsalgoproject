package testrunners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = {"stepdefinitions","hooks"},
<<<<<<< HEAD
	    tags="@stackpage"
	)


=======
	    
	    tags="@logintag" )
>>>>>>> 2527d572af3d84453de48d3587b60902031ac224

public class TestRunner extends AbstractTestNGCucumberTests {
	
}
