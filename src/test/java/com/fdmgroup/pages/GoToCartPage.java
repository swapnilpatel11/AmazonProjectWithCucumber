package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoToCartPage {
	public static WebElement gotocart(WebDriver driver) {
		return driver.findElement(By.partialLinkText("Go to cart"));
	}

}
