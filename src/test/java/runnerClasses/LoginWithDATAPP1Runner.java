package runnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




								@CucumberOptions(
										
										
										features = {"src\\test\\resources\\FeatureFiles\\LoginWithDATAPP1.feature"},
										
										glue = {"stepDefinationClasses"},
										
										publish =true
										
										
										
										
								)
								


public class LoginWithDATAPP1Runner extends AbstractTestNGCucumberTests {

}
