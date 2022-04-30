package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
//	public static WebElement gotocart(WebDriver driver) {
//		return driver.findElement(By.partialLinkText("Go to cart"));
//	}
	public static WebElement shoppingcart(WebDriver driver) {
		return driver.findElement(By.xpath("//h1[contains(text(), 'Shopping Cart')]"));
	}
}
