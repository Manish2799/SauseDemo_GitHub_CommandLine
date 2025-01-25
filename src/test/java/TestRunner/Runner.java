package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/FeatureFiles",
		glue="StepAPI",
		monochrome=true,
		dryRun=false
		
		)

public class Runner extends AbstractTestNGCucumberTests{

}
