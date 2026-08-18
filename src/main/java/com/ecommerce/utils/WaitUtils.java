package com.ecommerce.utils;

import com.ecommerce.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

	private static final Duration TIMEOUT = Duration.ofSeconds(10);

	private WaitUtils() {
	}

	public static void waitForVisibility(By locator) {

		WebDriver driver = DriverFactory.getDriver();

		WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void waitForClickability(By locator) {

		WebDriver driver = DriverFactory.getDriver();

		WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);

		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public static void waitForUrl(String url) {

		WebDriver driver = DriverFactory.getDriver();

		WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);

		wait.until(ExpectedConditions.urlContains(url));
	}
}