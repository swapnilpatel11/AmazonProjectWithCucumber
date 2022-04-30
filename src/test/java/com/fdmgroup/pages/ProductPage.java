package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	
	public static WebElement amazonLogo(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	}

}
