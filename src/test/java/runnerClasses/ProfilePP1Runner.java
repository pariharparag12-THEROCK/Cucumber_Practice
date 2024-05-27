package runnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


							@CucumberOptions(
									
									
									features = {"src\\test\\resources\\FeatureFiles\\ProfilePP1.feature"},
									
									glue = {"stepDefinationClasses","hooks" },			
									
									plugin = {"pretty", "html:target/Cucumber-REPORTS/ProfilePP1TestResults.html", "rerun:target/FailedRerun.txt"},
									
									publish = true,
									
									//tags = "(@Functional or @Sanity) and (not @Regression)",
									
									/* If you are using the tags in hooks then no need to write here in runner */
									
									
									//tags = "@Profile"	
									
									//dryRun = true
									
									tags = "@Functional"	
									
							)
							
						
public class ProfilePP1Runner extends AbstractTestNGCucumberTests{

}
