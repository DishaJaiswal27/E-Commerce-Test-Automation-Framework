package com.ecommerce.pages;

import org.openqa.selenium.By;

public class SearchResultsPage extends BasePage {

	private By firstProductContaining(String productName) {

		return By.xpath("(//h2[@class='product-title']//a[" + "contains(translate(normalize-space(.), "
				+ "'ABCDEFGHIJKLMNOPQRSTUVWXYZ', " + "'abcdefghijklmnopqrstuvwxyz'), " + "'" + productName.toLowerCase()
				+ "')])[1]");
	}

	public boolean isSearchResultDisplayed(String productName) {
	    return isDisplayed(firstProductContaining(productName));
	}

	public void selectFirstProduct(String productName) {
	    click(firstProductContaining(productName));
	}
}