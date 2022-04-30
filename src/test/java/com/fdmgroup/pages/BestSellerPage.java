package com.fdmgroup.pages;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BestSellerPage {
	public static WebElement bestSellerLabel(WebDriver driver) {
		return driver.findElement(By.id("zg_banner_text"));
	}
	
	public static List<WebElement> bestProducts(WebDriver driver){
		return driver.findElements(By.cssSelector("div[id='anonCarousel1'] ol[role='list']"));
	}
	
	public static WebElement productMask(WebDriver driver) {
		return driver.findElement(By.xpath("//div[normalize-space()='Disposable Face Masks 3 Ply Masks with Adjustable Nose Strip Comfortable Cotton 3-Ply Masks for Every Day Use']"));
	}
}
