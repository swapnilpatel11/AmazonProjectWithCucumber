package com.fdmgroup.testScript;

import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

import com.fdmgroup.pages.AmazonPage;
import com.fdmgroup.pages.BestSellerPage;
import com.fdmgroup.pages.HistoryPage;
import com.fdmgroup.pages.ProductPage;
import com.fdmgroup.utill.DriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrowserHistoryStepTest {
	private DriverUtility utility=DriverUtility.getInstance();
	private WebDriver driver =utility.getDriver();
	
	
	@Given("click on best seller link")
	public void click_on_best_seller_link() {
		
	    AmazonPage.bestSeller(driver).click();
	}

	@Given("click on first product")
	public void click_on_first_product() {
	    BestSellerPage.productMask(driver).click();
	}

	@Given("click on amazon logo")
	public void click_on_amazon_logo() {
	   ProductPage.amazonLogo(driver).click();
	}

	@When("check for browser history link or tab")
	public void check_for_browser_history_link_or_tab() {
	    assertTrue(AmazonPage.viewHistory(driver).isDisplayed());
	}

	@When("click on browser history tab")
	public void click_on_browser_history_tab() {
	    AmazonPage.viewHistory(driver).click();
	}

	@Then("verify recently viewed product is present or not")
	public void verify_recently_viewed_product_is_present_or_not() {
	    String expected = BestSellerPage.productMask(driver).getText();
	    String actual = HistoryPage.historyProduct(driver).getText();
	    assertEquals(expected,actual);
	}
	
	@Then("quit browser")
	public void quit_browser() {
		driver.quit();
	}

}
