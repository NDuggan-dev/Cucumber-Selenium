package com.qa.cucumber_selenium;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:features" }, 
				 glue = {"com.qa.cucumber_selenium" }, 
				 snippets = SnippetType.CAMELCASE, 
				 plugin = {"summary",
						   "html:target/cucumber-reports/cucumber-html-report.html",
						   "junit:target/cucumber-reports/cucumber-junit-report.xml"
				 },
				 tags = "@selenium",
				 monochrome = true)
public class CucumberSeleniumRunner {

}
