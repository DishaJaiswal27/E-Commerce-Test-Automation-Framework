package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage {

	private final By checkoutHeading = By.cssSelector("div.page-title h1");

	private final By countryDropdown = By.id("BillingNewAddress_CountryId");
	private final By cityField = By.id("BillingNewAddress_City");
	private final By address1Field = By.id("BillingNewAddress_Address1");
	private final By zipCodeField = By.id("BillingNewAddress_ZipPostalCode");
	private final By phoneNumberField = By.id("BillingNewAddress_PhoneNumber");
	private final By billingAddressDropdown = By.cssSelector("select#billing-address-select");
	// Billing address
	private final By billingContinueButton = By.cssSelector("input[onclick*='Billing.save']");

	// Shipping address
	private final By shippingContinueButton = By.cssSelector("input[onclick*='Shipping.save']");

	// Shipping method
	private final By shippingMethodContinueButton = By.cssSelector("input[onclick*='ShippingMethod.save']");

	// Payment method
	private final By paymentMethodContinueButton = By.cssSelector("input[onclick*='PaymentMethod.save']");

	// Payment information
	private final By paymentInfoContinueButton = By.cssSelector("input[onclick*='PaymentInfo.save']");

	// Confirm order
	private final By confirmOrderButton = By.cssSelector("input[onclick*='ConfirmOrder']");
	
	public void selectNewAddress() {
		Select select = new Select(driver.findElement(billingAddressDropdown));
		select.selectByVisibleText("New Address");
	}
	public void selectCountry(String country) {
        Select select = new Select(driver.findElement(countryDropdown));
        select.selectByVisibleText(country);
    }

    public void enterCity(String city) {
    	enterText(cityField, city);
    }

    public void enterAddress1(String address) {
    	enterText(address1Field, address);
    }

    public void enterZipCode(String zipCode) {
    	enterText(zipCodeField, zipCode);
    }

    public void enterPhoneNumber(String phoneNumber) {
    	enterText(phoneNumberField, phoneNumber);
    }

	public boolean isCheckoutPageDisplayed() {

		return isDisplayed(checkoutHeading);
	}

	public void continueBillingAddress() {

		click(billingContinueButton);
	}

	public void continueShippingAddress() {

		click(shippingContinueButton);
	}

	public void continueShippingMethod() {

		click(shippingMethodContinueButton);
	}

	public void continuePaymentMethod() {

		click(paymentMethodContinueButton);
	}

	public void continuePaymentInformation() {

		click(paymentInfoContinueButton);
	}

	public void confirmOrder() {

		click(confirmOrderButton);
	}
}