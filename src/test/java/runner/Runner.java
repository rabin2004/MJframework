package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\User\\Desktop\\eclipse\\MJFramework\\src\\main\\java\\features",
				glue = "step_definations",
				plugin = {"pretty", "html:target/cucumber_report"},
				monochrome = true)
	
public class Runner {
	
}
