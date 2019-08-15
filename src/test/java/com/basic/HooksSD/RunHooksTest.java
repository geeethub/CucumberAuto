package com.basic.HooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		monochrome=true,
		//dryRun=true,
		features={"src/test/resources/com/basic/HooksFileFF/"},
		glue={"com/basic/HooksSD/"},
		plugin={
				
				"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report4.json",
				 "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html"
		}
		
		
		)

public class RunHooksTest {
	
	
	

}
