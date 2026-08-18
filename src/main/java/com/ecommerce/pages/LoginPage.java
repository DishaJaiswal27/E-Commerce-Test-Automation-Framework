package com.ecommerce.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

	private final By loginLink = By.className("ico-login");

	private final By loginPageHeading = By.cssSelector("div.page-title h1");

	public void clickLogin() {
		click(loginLink);
	}

	public boolean isLoginPageDisplayed() {
		return isDisplayed(loginPageHeading);
	}
}