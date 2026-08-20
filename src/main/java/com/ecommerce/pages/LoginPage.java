package com.ecommerce.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.ecommerce.utils.LoggerUtils;

public class LoginPage extends BasePage {

	private final By loginLink = By.className("ico-login");

	private final By emailField = By.id("Email");

	private final By passwordField = By.id("Password");

	private final By loginButton = By.cssSelector("input[value='Log in']");

	private final By loginPageHeading = By.cssSelector("div.page-title h1");

	private final By accountLink = By.className("account");

	private final By logoutLink = By.className("ico-logout");

	private static final Logger logger = LoggerUtils.getLogger(LoginPage.class);

	public void openLoginPage() {
		logger.info("Opening login page");
		click(loginLink);
	}

	public void enterEmail(String email) {
		 logger.info("Entering email");
		enterText(emailField, email);
	}

	public void enterPassword(String password) {
		 logger.info("Entering password");
		enterText(passwordField, password);
	}

	public void clickLoginButton() {
		 logger.info("Clicking login button");
		click(loginButton);
	}

	public boolean isLoginPageDisplayed() {
		 logger.info("Login Page is displaying");
		return isDisplayed(loginPageHeading);
	}

	public boolean isUserLoggedIn() {
		 logger.info("User logging");
		return isDisplayed(accountLink);
	}

	public void logout() {
		logger.info("Logging out user");
		click(logoutLink);
	}

	public boolean isUserLoggedOut() {
		 logger.info("User logged out");
		return isDisplayed(loginLink);
	}
}