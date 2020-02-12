package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	features ="C:\\Users\\raika\\eclipse-workspace\\cucumber\\src\\main\\java\\feature"
	,glue= {"stepdefination"},
	dryRun=false,
	monochrome=true,
	plugin= {"pretty","html:test-output","json:json_output/cucumber.json"},
	strict=true
	
	
)
public class testrunner {

}
