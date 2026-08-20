package com.ecommerce.stepdefinitions;

import static org.testng.Assert.assertTrue;

import com.ecommerce.pages.CartPage;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.ProductPage;
import com.ecommerce.pages.SearchResultsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartSteps {

	private HomePage homePage;
	private ProductPage productPage;
	private CartPage cartPage;
	private SearchResultsPage searchResultsPage;
	private String selectedProductName;

	@When("user searches for product {string}")
	public void userSearchesForProduct(String productName) {

		selectedProductName = productName;
		homePage = new HomePage();

		homePage.searchProduct(productName);

		searchResultsPage = new SearchResultsPage();

		assertTrue(searchResultsPage.isSearchResultDisplayed(productName),
				"Search result not found for: " + productName);

		searchResultsPage.selectFirstProduct(productName);

		productPage = new ProductPage();
	}

	@When("user adds the product to cart")
	public void userAddsTheProductToCart() {

		assertTrue(productPage.isProductDisplayed(), "Product page is not displayed");

		productPage.addToCart();
	}

	@When("user opens the shopping cart")
	public void userOpensShoppingCart() {

		homePage.openCart();

		cartPage = new CartPage();
	}

	@Then("shopping cart should display the product")
	public void shoppingCartShouldDisplayTheProduct() {

		assertTrue(cartPage.isCartPageDisplayed(), "Shopping cart page is not displayed");

		assertTrue(cartPage.isProductDisplayedInCart(selectedProductName), "Expected product is not displayed in cart");
	}

	@When("user updates the cart")
	public void userUpdatesTheCart() {

		cartPage.updateQuantity("2");

		cartPage.updateCart();
	}

	@When("user removes the product from the cart")
	public void userRemovesTheProductFromTheCart() {

		cartPage.removeProduct();
		cartPage.updateCart();
	}

	@Then("product should be removed from the shopping cart")
	public void productShouldBeRemovedFromTheShoppingCart() {

		assertTrue(cartPage.isProductRemovedFromCart(selectedProductName),
				"Product is still displayed in the shopping cart");
	}
}