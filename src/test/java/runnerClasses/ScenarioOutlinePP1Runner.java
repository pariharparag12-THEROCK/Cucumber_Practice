package runnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


							@CucumberOptions(
									
									features = {"src\\test\\resources\\FeatureFiles\\ScenarioOutlinePP1.feature"},
									
									glue = {"stepDefinationClasses"},
									
									publish = true
									
																
									
							)




public class ScenarioOutlinePP1Runner extends AbstractTestNGCucumberTests{

}
