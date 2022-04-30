package com.fdmgroup.testScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.datafile.DataFile;
import com.fdmgroup.pages.SearchPage;
import com.fdmgroup.utill.DriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchStepTest {
	private DriverUtility utility=DriverUtility.getInstance();
	private WebDriver driver =utility.getDriver();
	@Given("user should launch the application")
	public void user_should_launch_the_application() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10 ));
	    driver.get(DataFile.homePageURL);
	}

	@When("User enters an item to search and clicks Enter")
	public void user_enters_an_item_to_search_and_clicks_enter() {
		SearchPage.searchInputBox(driver).sendKeys(DataFile.searchData +Keys.ENTER);
	}

	@Then("user Should get Items according to the Search Data")
	public void user_should_get_items_according_to_the_search_data() {
		String Expected = SearchPage.searchField(driver).getText();
		System.out.println(Expected);
		String str1 =  Expected.replaceAll("\"", "");
		System.out.println(str1);
		assertEquals(DataFile.searchData,str1);
		System.out.println(str1);
	}

	@When("user selects the BrandName and Size and Color")
	public void user_selects_the_brand_name_and_size_and_color() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()",SearchPage.chooseBrandFromTheBrandRefinements(driver, DataFile.brandName));
		 SearchPage.selectSizeFromTheBrandFilters(driver, DataFile.brandSize).click();
	     js.executeScript("arguments[0].click()",SearchPage.selectColorFromTheBrandFilters(driver, DataFile.brandColor));
	}

	@Then("user Should get Items Sorted according to the selection")
	public void user_should_get_items_sorted_according_to_the_selection() {
		String firstProductBrandName = SearchPage.searchresultsFirstProductBrand(driver).getText();
        String secondProductBrandName = SearchPage.searchresultsLastProductBrand(driver).getText();
		assertEquals(firstProductBrandName, secondProductBrandName);
		String ResultsText = SearchPage.searchresultsText(driver).getText();
        System.out.println(ResultsText);
        assertEquals(DataFile.ResultsText, ResultsText);
	}
}

