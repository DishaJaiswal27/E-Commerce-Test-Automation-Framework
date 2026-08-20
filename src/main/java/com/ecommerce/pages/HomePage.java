package com.ecommerce.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

	private final By searchBox = By.id("small-searchterms");

	private final By searchButton = By.cssSelector("input[value='Search']");

	private final By cartLink = By.className("ico-cart");

	private final By logoutLink = By.className("ico-logout");

	public void logout() {
		click(logoutLink);
	}

	public boolean isUserLoggedOut() {
		return isDisplayed(By.className("ico-login"));
	}

	public void searchProduct(String productName) {

		enterText(searchBox, productName);
		click(searchButton);
	}

	public void openCart() {
		click(cartLink);
	}

	public String getPageTitle() {
		return super.getPageTitle();
	}
}