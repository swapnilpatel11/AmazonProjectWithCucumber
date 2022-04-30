package com.fdmgroup.testScript;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {
		"com.fdmgroup.testScript" }, publish = true, plugin = { "pretty", "html:target/cucumber.html",
																		"junit:target/cucumber.xml", 
																		"json:target/cucumber.json" })

public class TestRunner {

}
