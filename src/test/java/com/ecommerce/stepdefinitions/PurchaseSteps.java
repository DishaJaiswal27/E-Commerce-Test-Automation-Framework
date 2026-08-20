package com.ecommerce.stepdefinitions;

import static org.testng.Assert.assertTrue;

import com.ecommerce.pages.CartPage;
import com.ecommerce.pages.CheckoutPage;
import com.ecommerce.pages.OrderConfirmationPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseSteps {

	private CartPage cartPage;
	private CheckoutPage checkoutPage;
	private OrderConfirmationPage orderConfirmationPage;

	@When("user proceeds to checkout")
	public void userProceedsToCheckout() {

		cartPage = new CartPage();

		cartPage.agreeToTermsAndCheckout();

		checkoutPage = new CheckoutPage();
	}

	@Then("checkout page should be displayed")
	public void checkoutPageShouldBeDisplayed() {

		assertTrue(checkoutPage.isCheckoutPageDisplayed(), "Checkout page is not displayed");
	}

	@When("user completes the checkout process with {string}, {string}, {string}, {string} and {string}")
	public void userCompletesTheCheckoutProcessWith(String country, String city, String address, String zipCode,
			String phoneNumber) {
		checkoutPage.selectNewAddress();
		checkoutPage.selectCountry(country);
		checkoutPage.enterCity(city);
		checkoutPage.enterAddress1(address);
		checkoutPage.enterZipCode(zipCode);
		checkoutPage.enterPhoneNumber(phoneNumber);

		checkoutPage.continueBillingAddress();

		checkoutPage.continueShippingAddress();

		checkoutPage.continueShippingMethod();

		checkoutPage.continuePaymentMethod();

		checkoutPage.continuePaymentInformation();

		checkoutPage.confirmOrder();
	}

	@Then("order confirmation should be displayed")
	public void orderConfirmationShouldBeDisplayed() {

		orderConfirmationPage = new OrderConfirmationPage();

		assertTrue(orderConfirmationPage.isOrderConfirmed(), "Order confirmation is not displayed");
	}
}