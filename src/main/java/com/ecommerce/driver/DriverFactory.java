package com.ecommerce.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ecommerce.config.ConfigReader;

public class DriverFactory {

	private static WebDriver driver;

	public static void initializeDriver() {

		String browser = ConfigReader.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {

			
			ChromeOptions options = new ChromeOptions();

			options.addArguments("--disable-notifications");
			options.addArguments("--disable-popup-blocking");
			options.addArguments("--incognito");

			driver = new ChromeDriver(options);

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else {

			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}

		driver.manage().window().maximize();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void quitDriver() {

		if (driver != null) {

			driver.quit();
			driver = null;
		}
	}
}