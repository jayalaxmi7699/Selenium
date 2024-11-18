package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\Jayalaxmi\\SELINIUM-Workspace\\Cucumber1\\features",
    glue = "stepDefinitions",
    plugin = {"pretty", "html:target/cucumber-report.html"},
    monochrome = true,
    tags = "@login"
)
public class TestRunner {

}
