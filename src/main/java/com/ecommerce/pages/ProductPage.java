package com.ecommerce.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage {

	private final By productName = By.cssSelector("div.product-name h1");

	private final By addToCartButton = By.cssSelector("input[value='Add to cart']");

	public boolean isProductDisplayed() {
		return isDisplayed(productName);
	}

	public String getProductName() {
		return getText(productName);
	}

	public void addToCart() {
		click(addToCartButton);
	}
}