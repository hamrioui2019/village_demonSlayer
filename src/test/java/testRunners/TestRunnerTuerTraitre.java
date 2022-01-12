package testRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)  
@CucumberOptions(
features = {"src/test/resources/dojo/TuerTraitre.feature"},
glue = {"villageTest"},
plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/index.html","pretty:target/cucumber-reports/cucumber-pretty.txt","usage:target/cucumber-reports/cucumber-usage.json", "junit:target/cucumber-reports/cucumber-results.xml"}, //to generate different types of reporting
strict = true, //it will check if any step is not defined in step definition file
monochrome = true, //display the console output in a proper readable format
dryRun = false //to check the mapping is proper between feature file and step def file
//publish = true
// tags = "(@SmokeTest or @Regression) and (not @pending)"
)
public class TestRunnerTuerTraitre {

}
