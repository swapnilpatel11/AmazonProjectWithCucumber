package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddItemPage {
	public static WebElement selectCartItem(WebDriver driver) {
		return driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div[1]/div/span/a/div/img[1]"));

	}

	public static WebElement selectQuantity(WebDriver driver) {
		return driver.findElement(By.id("quantity"));

	}

	public static WebElement addToCartButton(WebDriver driver) {
		return driver.findElement(By.id("add-to-cart-button"));

	}

	public static WebElement checkItemIsAddedToCart(WebDriver driver) {
		return driver.findElement(By.name("proceedToRetailCheckout"));
	}

	public static WebElement clickOnProceed(WebDriver driver) {
		return driver.findElement(By.name("proceedToRetailCheckout"));

	}
}
