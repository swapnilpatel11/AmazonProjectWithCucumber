package com.fdmgroup.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;
import com.fdmgroup.datafile.DataFile;
import com.fdmgroup.pages.AmazonPage;
import com.fdmgroup.pages.NewReleasesPage;
import com.fdmgroup.utill.DriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewReleasesStepTest {
	private DriverUtility utility=DriverUtility.getInstance();
	private WebDriver driver =utility.getDriver();
	
	@Given("user can see new releases quick link")
	public void user_can_see_new_releases_quick_link() {
	    assertTrue(AmazonPage.newReleases(driver).isDisplayed());
	}

	@When("user click on new releases link")
	public void user_click_on_new_releases_link() {
	   AmazonPage.newReleases(driver).click();
	}

	@When("verify user on new release page")
	public void verify_user_on_new_release_page() {
		String actual = NewReleasesPage.newReleasePageLabel(driver).getText();
	   assertEquals(DataFile.newReleaseLabel,actual);
	}

	@Then("print new launch products with price")
	public void print_new_launch_products_with_price() {
	    for(WebElement product : NewReleasesPage.newProducts(driver)) {
	    	System.out.println(product.getText());
	    }
	}

}
