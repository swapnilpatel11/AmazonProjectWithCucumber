package com.fdmgroup.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.datafile.DataFile;
import com.fdmgroup.pages.AmazonPage;
import com.fdmgroup.pages.BestSellerPage;
import com.fdmgroup.utill.DriverUtility;
import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BestSellerStepTest {
	private DriverUtility utility=DriverUtility.getInstance();
	private WebDriver driver =utility.getDriver();
	
	@Given("user can see best sellers quick link")
	public void user_can_see_best_sellers_quick_link() {
		assertTrue(AmazonPage.bestSeller(driver).isDisplayed());
	}

	@When("user click on best seller link")
	public void user_click_on_best_seller_link() {
	    AmazonPage.bestSeller(driver).click();
	}

	@When("verify user on right page")
	public void verify_user_on_right_page() {
	  String actual =   BestSellerPage.bestSellerLabel(driver).getText();
		assertEquals(DataFile.bestSellerLabel,actual);
	}

	@Then("print top products with price")
	public void print_top_products_with_price() {
	  for(WebElement product : BestSellerPage.bestProducts(driver)) {
		 System.out.println(product.getText());
	  }
	}

}
