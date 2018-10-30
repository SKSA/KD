package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Ammu\\eclipse-workspace\\KorberDigital_AutomationFrameWork\\src\\main\\java\\Features"
		,glue={"stepDefinitions"}
		)

public class TestRunner {
	

}

