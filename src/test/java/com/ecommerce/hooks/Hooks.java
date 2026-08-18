package com.ecommerce.hooks;

import com.ecommerce.config.ConfigReader;
import com.ecommerce.driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() {

		DriverFactory.initializeDriver();

		DriverFactory.getDriver().get(ConfigReader.getProperty("url"));
	}

	@After
	public void tearDown() {

		DriverFactory.quitDriver();
	}
}