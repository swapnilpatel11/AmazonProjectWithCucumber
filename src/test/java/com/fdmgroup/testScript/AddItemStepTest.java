package com.fdmgroup.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.*;

import com.fdmgroup.datafile.DataFile;
import com.fdmgroup.pages.AddItemPage;
import com.fdmgroup.utill.DriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddItemStepTest {
	private DriverUtility utility=DriverUtility.getInstance();
	private WebDriver driver =utility.getDriver();

	@Given("select item to add")
	public void select_item_to_add() {
	AddItemPage.selectCartItem(driver).click();
	}



	@Given("select quatity to add")
	public void select_quatity_to_add() {
	Select quantitySelected= new Select(AddItemPage.selectQuantity(driver));
	quantitySelected.selectByVisibleText(DataFile.quantityOfShirts);
	}



	@Given("click add to cart button")
	public void click_add_to_cart_button() {
	AddItemPage.addToCartButton(driver).click();
	}



	@When("item added to cart")
	public void item_added_to_cart() {
	boolean displayed=AddItemPage.checkItemIsAddedToCart(driver).isDisplayed();
	assertEquals(true,displayed);
	}



	@Then("user can proceed to checkout")
	public void user_can_proceed_to_checkout() {
	AddItemPage.clickOnProceed(driver).click();
	}



}
