package com.ecommerce.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "com.ecommerce.stepdefinitions",
		"com.ecommerce.hooks" }, plugin = { "pretty", "html:target/cucumber-report.html" }, monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}