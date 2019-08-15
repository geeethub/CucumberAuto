package com.basic.DatatableSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		monochrome=true,
		//dryRun=true,
		features={"src/test/resources/com/basic/DatatableFileFF/"},
		glue={"com/basic/DatatableSD/"},
		plugin={
				
				"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report3.json",
				 "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"
			
		}
		
		
		)

public class RunDatatableTest {
	
	
	

}