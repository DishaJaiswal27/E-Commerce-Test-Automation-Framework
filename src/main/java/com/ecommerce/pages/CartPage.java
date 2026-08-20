package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class CartPage extends BasePage {

	private final By cartHeading = By.xpath("//div[@class='page-title']/h1[text()='Shopping cart']");

	private final By productName = By.cssSelector("td.product a.product-name");

	private final By removeProductCheckbox = By.cssSelector("input[name='removefromcart']");

	private final By updateCartButton = By.name("updatecart");

	private final By checkoutButton = By.id("checkout");
	private final By termsCheckbox = By.id("termsofservice");
	private final By quantityInput = By.cssSelector("input.qty-input");

	public void agreeToTermsAndCheckout() {
		click(termsCheckbox);
		click(checkoutButton);
	}

	public boolean isCartPageDisplayed() {
		return isDisplayed(cartHeading);
	}

	public boolean isProductDisplayedInCart(String expectedProduct) {

		String actualProduct = getText(productName);

		return actualProduct.contains(expectedProduct);
	}

	public boolean isProductRemovedFromCart(String expectedProduct) {

		try {

			return !driver.findElement(productName).getText().contains(expectedProduct);

		} catch (NoSuchElementException e) {

			return true;
		}
	}

	public void removeProduct() {
		click(removeProductCheckbox);
	}

	public void updateQuantity(String quantity) {

		enterText(quantityInput, quantity);
	}

	public void updateCart() {
		click(updateCartButton);
	}

	public void clickCheckout() {
		click(checkoutButton);
	}
}