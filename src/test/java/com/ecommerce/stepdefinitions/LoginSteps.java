package com.ecommerce.stepdefinitions;

import com.ecommerce.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertTrue;

public class LoginSteps {

	private LoginPage loginPage;

	@Given("user is on the Demo Web Shop login page")
	public void userIsOnLoginPage() {

		loginPage = new LoginPage();

		loginPage.openLoginPage();
	}

	@When("user logs in with {string} and {string}")
	public void userLogsInWithCredentials(String email, String password) {

		loginPage.enterEmail(email);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();
	}

	@Then("user should be logged in successfully")
	public void userShouldBeLoggedInSuccessfully() {

		assertTrue(loginPage.isUserLoggedIn(), "User is not logged in");
	}

	@When("user logs out")
	public void userLogsOut() {

		loginPage.logout();
	}

	@Then("user should be logged out successfully")
	public void userShouldBeLoggedOutSuccessfully() {

		assertTrue(loginPage.isUserLoggedOut(), "User is not logged out successfully");
	}
}