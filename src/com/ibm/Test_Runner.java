package com.ibm;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.sitture.ExtentReporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",
tags = {"@successful"},
snippets = SnippetType.CAMELCASE,
plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "junit:target/cucumber-results.xml" }
)
public class Test_Runner {
	 @AfterClass
	    public static void setup() {
	        ExtentReporter.setConfig("Feature/config.xml");
	        ExtentReporter.setSystemInfo("Browser", "Firefox");
	        ExtentReporter.setSystemInfo("Selenium", "v3.7.1");
	    }
}