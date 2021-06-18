package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = {"src/test/resources/Features/"},
	        glue = {"StepDefs"},
	        plugin={"html:target/cucumber-report.html"}
)

public class TestRunner
{

}



//html:target/cucumber-report.html
//junit:target/junit.xml"
//pretty","html:target/cucumber-report.html