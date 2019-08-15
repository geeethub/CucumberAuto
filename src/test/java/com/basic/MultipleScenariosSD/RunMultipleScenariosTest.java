package com.basic.MultipleScenariosSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		monochrome=true,
		//dryRun=true,
		features={"src/test/resources/com/basic/MultipleScenariosFileFF/"},
		glue={"com/basic/MultipleScenariosSD/"},
		plugin={
				
				"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report5.json",
				 "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
			
		}
		
		
		)

public class RunMultipleScenariosTest {
	
	
	

}