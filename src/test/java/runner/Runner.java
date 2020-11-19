package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\User\\Desktop\\eclipse\\MJFramework\\src\\main\\java\\features",
				glue = "step_definations",
				// usage - to check duration of execution of components, but usage can't be used along with pretty
				// creating - html, json, junit reports
				plugin = {"pretty", "html:target/cucumber-reports",
						"json:target/cucumber.json", 
						"junit:target/cucumber.xml"},
				monochrome = true)

	
public class Runner {
	
}
