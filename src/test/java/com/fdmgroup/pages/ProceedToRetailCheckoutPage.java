package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProceedToRetailCheckoutPage {
	public static WebElement proceedtoCheckout(WebDriver driver) {
		return driver.findElement(By.xpath("//input[contains(@name, 'proceedToRetailCheckout')]"));
		
	}
	
	public static WebElement shippingaddress(WebDriver driver) {
		return driver.findElement(By.xpath("//span[contains(@class, 'a-button-inner')]"));
		//return driver.findElement(By.cssSelector("body > div:nth-child(7) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1) > a:nth-child(1)"));
		//return driver.findElement(By.partialLinkText("Deliver to this addr"));
	}
}
