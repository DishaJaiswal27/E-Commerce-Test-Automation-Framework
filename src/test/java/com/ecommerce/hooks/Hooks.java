package com.ecommerce.hooks;

import org.apache.logging.log4j.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.ecommerce.config.ConfigReader;
import com.ecommerce.driver.DriverFactory;
import com.ecommerce.reports.ExtentReportManager;
import com.ecommerce.utils.LoggerUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	private static ExtentReports extentReports;
	private static ExtentTest extentTest;

	private static final Logger logger = LoggerUtils.getLogger(Hooks.class);

	@Before
	public void setUp(Scenario scenario) {

		logger.info("Starting scenario: {}", scenario.getName());

		DriverFactory.initializeDriver();

		logger.info("Browser initialized");

		DriverFactory.getDriver().get(ConfigReader.getProperty("url"));

		logger.info("Application URL opened");

		extentReports = ExtentReportManager.getReportInstance();

		extentTest = extentReports.createTest(scenario.getName());
	}

	@After
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {

			logger.error("Scenario FAILED: {}", scenario.getName());

			extentTest.fail("Scenario Failed");

			byte[] screenshot = ((org.openqa.selenium.TakesScreenshot) DriverFactory.getDriver())
					.getScreenshotAs(org.openqa.selenium.OutputType.BYTES);

			scenario.attach(screenshot, "image/png", "Failure Screenshot");

			extentTest.addScreenCaptureFromBase64String(java.util.Base64.getEncoder().encodeToString(screenshot),
					"Failure Screenshot");

		} else {

			logger.info("Scenario PASSED: {}", scenario.getName());

			extentTest.pass("Scenario Passed");
		}

		extentReports.flush();

		logger.info("Extent report flushed");

		DriverFactory.quitDriver();

		logger.info("Browser closed");
	}
}