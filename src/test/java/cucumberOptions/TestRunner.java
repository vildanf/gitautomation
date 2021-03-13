package cucumberOptions;



import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/features",
		glue= "stepDefinations", tags="@RegressionTest",strict=true,monochrome=true,//tags="@SmokeTest,@RegTest"
		plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"}
		)
 public class TestRunner {
	
	

}
