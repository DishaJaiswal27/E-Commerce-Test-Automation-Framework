package com.ecommerce.stepdefinitions;

import com.ecommerce.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.testng.Assert.assertTrue;

public class LoginSteps {

	private LoginPage loginPage;

	@Given("user is on the Demo Web Shop login page")
	public void userIsOnLoginPage() {

		loginPage = new LoginPage();
		loginPage.clickLogin();
	}

	@Then("login page should be displayed")
	public void loginPageShouldBeDisplayed() {

		assertTrue(loginPage.isLoginPageDisplayed(), "Login page is not displayed");
	}
}