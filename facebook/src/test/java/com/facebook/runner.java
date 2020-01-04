package com.facebook;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/resources/features",
		plugin={"html:target/cucumber-html-report"}
)

public class runner{
	
}