package runnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



				@CucumberOptions (
						
						features = {"src\\test\\resources\\FeatureFiles\\loginPP1.feature"},
						
						glue  = {"stepDefinationClasses"},
						
						publish = true
						
						
						
				)
			

public class LoginRunnerPP1 extends AbstractTestNGCucumberTests {
		
}
