package com.fdmgroup.testScript;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.datafile.DataFile;
import com.fdmgroup.pages.AmazonLinkVarification;
import com.fdmgroup.pages.AmazonPage;
import com.fdmgroup.pages.LoginPage;
import com.fdmgroup.pages.MainPage;
import com.fdmgroup.pages.SearchPage;
import com.fdmgroup.pages.SigninVarification;
import com.fdmgroup.utill.DriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepTest {
	private DriverUtility utility;
	private WebDriver driver;
	
	@Given("user open the browser")
	public void user_open_the_browser() {
		utility =DriverUtility.getInstance();
		driver =utility.getDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10 ));
	}

	@Given("user launch the google webpage")
	public void user_launch_the_google_webpage() {
		driver.manage().window().maximize(); //maximize the window
		driver.get(DataFile.browser); //open the search engine
	}

	@Given("user write amazon in search box")
	public void user_write_amazon_in_search_box() {
		MainPage.searchbar(driver).sendKeys(DataFile.searchKeyword + Keys.ENTER); //enter the value in search bar
	}

	@When("user click on amazon link")
	public void user_click_on_amazon_link() {
		SearchPage.websiteLink(driver).click(); //get the link for the website
	}

	@When("amazon page verification")
	public void amazon_page_verification() {
		assertEquals(DataFile.logo, AmazonLinkVarification.link(driver).getText());
	}

	@When("click signin button")
	public void click_signin_button() {
		AmazonPage.siginbutton(driver).click(); //for login
	}

	@When("user enter email and password")
	public void user_enter_email_and_password() {
		LoginPage.email(driver).sendKeys(DataFile.username); //username 
		LoginPage.submit(driver).click();
		LoginPage.password(driver).sendKeys(DataFile.password); //password
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		System.out.println("Before Clicking" + LoginPage.checkbox(driver).isSelected());
		LoginPage.checkbox(driver).click();
		System.out.println("After Clicking" + LoginPage.checkbox(driver).isSelected());
		LoginPage.enter(driver).click();
	}

	@Then("user page verification")
	public void user_page_verification() {
		assertEquals(DataFile.usr, SigninVarification.getuser(driver).getText());
	}
	
}
