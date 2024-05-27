package runnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


								@CucumberOptions(
										
										
										features = {"src\\test\\resources\\FeatureFiles\\RegistrationPP1.feature"},
										
										glue = {"stepDefinationClasses"},
										
										publish = true,
										
										plugin = {"pretty"}
										
										
								)
								
								
							
public class RegistrationPP1Runner extends AbstractTestNGCucumberTests{

}
