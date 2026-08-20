package com.ecommerce.pages;

import org.openqa.selenium.By;

public class OrderConfirmationPage extends BasePage {

    private final By confirmationMessage =
            By.cssSelector("div.section.order-completed div.title strong");

    public boolean isOrderConfirmed() {
        return isDisplayed(confirmationMessage);
    }

    public String getConfirmationMessage() {
        return getText(confirmationMessage);
    }
}