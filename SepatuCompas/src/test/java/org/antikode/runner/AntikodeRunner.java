package org.antikode.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resource\\antikode.feature",
	    glue = "org.antikode.definitions",
	    plugin = {"html:target/cucumber-reports/testResult.html"},
	    monochrome = true,
	    tags = "@Register or @Login or @Checkout"
	)
public class AntikodeRunner {
	
}
