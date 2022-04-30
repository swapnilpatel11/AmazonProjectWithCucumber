package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HistoryPage {
	public static WebElement historyPageLabel(WebDriver driver) {
		return driver.findElement(By.xpath("//span[@class='a-size-large a-color-information']"));
	}
	
	public static WebElement historyProduct(WebDriver driver) {
		return driver.findElement(By.xpath("//div[normalize-space()='Disposable Face Masks 3 Ply Masks with Adjustable Nose Strip Comfortable Cotton 3-Ply Masks for Every Day Use']"));
	}
}
