package runnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


							@CucumberOptions(
									
									
									features = {"src\\test\\resources\\FeatureFiles\\OrderPP1.feature"},
									
									glue = {"stepDefinationClasses"},
									
									publish = true
									
									
									
									
							)


public class OrderRunnerPP1 extends AbstractTestNGCucumberTests{

}
