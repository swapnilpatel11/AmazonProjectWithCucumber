package com.fdmgroup.testScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

import com.fdmgroup.datafile.DataFile;
import com.fdmgroup.pages.AmazonPage;
import com.fdmgroup.utill.DriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FooterLinksStepTest {
	private DriverUtility utility=DriverUtility.getInstance();
	private WebDriver driver =utility.getDriver();
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10 ));
	    driver.get(DataFile.homePageURL);
	}

	@When("footer links are present")
	public void fotter_links_are_present() {
	    for(WebElement link : AmazonPage.footerLinks(driver)) {
	    	assertTrue(link.isDisplayed());
	    }
	}

	@Then("print all links present in footer")
	public void print_all_links_present_in_footer() {
		for(WebElement link : AmazonPage.footerLinks(driver)) {
	    	System.out.println(link.getText());
	    }
	}

}
