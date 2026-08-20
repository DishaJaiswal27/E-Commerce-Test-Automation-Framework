package com.ecommerce.pages;

import com.ecommerce.driver.DriverFactory;
import com.ecommerce.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	protected WebDriver driver;

	public BasePage() {
		this.driver = DriverFactory.getDriver();
	}

	protected void click(By locator) {

		WaitUtils.waitForClickability(locator);

		driver.findElement(locator).click();
	}

	protected void enterText(By locator, String text) {

		WaitUtils.waitForVisibility(locator);

		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(text);
	}

	protected String getText(By locator) {

		WaitUtils.waitForVisibility(locator);

		return driver.findElement(locator).getText();
	}

	protected boolean isDisplayed(By locator) {

		WaitUtils.waitForVisibility(locator);

		return driver.findElement(locator).isDisplayed();
	}

	protected String getPageTitle() {
		return driver.getTitle();
	}

	protected String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
}