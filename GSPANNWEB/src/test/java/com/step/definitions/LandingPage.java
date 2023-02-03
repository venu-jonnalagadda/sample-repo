package com.step.definitions;

import com.common.BaseClass;
import com.pagepane.LandingPagePane;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.*;
import java.util.*;

import org.json.simple.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LandingPage extends BaseClass{
	
	LandingPagePane landingPage = new LandingPagePane(LandingPagePane.driver);
	JSONObject jsonObject = null;
	public LandingPage() {
		JSONParser parser = new JSONParser();
	      try {
	         Object obj = parser.parse(new FileReader("C:\\Users\\venu.jonnalagadda\\eclipse-workspace\\GSPANNWEB\\src\\main\\resources\\testData.json"));
	         jsonObject = (JSONObject)obj;
	     } catch(Exception e) {
	         e.printStackTrace();
	      }
	}
	
	@Given("launch the browser")
	public void launch_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		 BaseClass.luanchBrowser();
	}
	
	@Then("close the browser")
	public void close_the_browser() {
		 driver.close();
	}
	
	@Given("user is on Landing page")
	public void user_is_on_landing_page() {
		
	}
	
	@Given("verify the user is on Landing page")
	public void verify_the_user_is_on_landing_page() {
		landingPage.luanchApplication();
	}
	
	@When("user clicks on nav item {string} tab")
	public void user_clicks_on_nav_item_tab(String string) {
		landingPage.clickTheNavItem(string);
	   
	}

	@Then("user is on the product listing page")
	public void user_is_on_the_product_listing_page() {
	    landingPage.userOnTheProductsListPage();
	}

	@Then("clicks on product {string} link")
	public void clicks_on_product_link(String string) {
	   landingPage.UserSelectBrandOption(string);
	}

	@Then("user on click the product")
	public void user_on_click_the_product() throws InterruptedException {
	   landingPage.userClickTheProduct();
	}

	@Then("user click on add to cart")
	public void user_click_on_add_to_cart() throws InterruptedException {
	   landingPage.clickTheAddToCart();
	}

	@Then("verify product added to cart")
	public void verify_product_added_to_cart() {
	   landingPage.verifyTheCartCount();
	}

	@When("user click on see more product details link")
	public void user_click_on_see_more_product_details_link() {
	   landingPage.clickTheSeeMoreDetails();
	}

	@Then("user navigates to product technical details page")
	public void user_navigates_to_product_technical_details_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user able to see all the description about the product")
	public void user_able_to_see_all_the_description_about_the_product() {
	    landingPage.productTechnicalDetails();
	}

	@When("user click on deliver to icon")
	public void user_click_on_deliver_to_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user on choose your location window")
	public void user_on_choose_your_location_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user enter valid pincodesamsung")
	public void user_enter_valid_pincodesamsung() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user click on apply button")
	public void user_click_on_apply_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify deliver to have the correct locationlink")
	public void verify_deliver_to_have_the_correct_locationlink() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	    
	}
	
	//**************** tdameritrade **************
	
	@When("user clicks on tdameritrade application nav item {string} tab")
	public void user_clicks_on_tdameritrade_application_nav_item_tab(String navItemInput) {
		landingPage.clickTheTDAmeriTradeAppNavItem(navItemInput);
	    
	}

	@Then("clicks on component {string} link")
	public void clicks_on_component_link(String componentInput) {
		landingPage.clickTheTDAmeriTradeAppComponent(componentInput);
	}

	@Then("verify component page opened {string}")
	public void verify_component_page_opened(String componentInput) {

		System.out.println("Component Page: " + (String) jsonObject.get(componentInput));
		System.out.println("Component URL: " + driver.getCurrentUrl());
		Assert.assertEquals((String) jsonObject.get(componentInput), driver.getCurrentUrl());
	}
	
	@Then("verify the userName and passWord on every Component page {string}")
	public void verify_the_user_name_and_pass_word_on_every_component_page(String componentpage) {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='cafe-iframe']")));
		boolean flag = driver.findElement(By.xpath("//input[@name='su_username']//ancestor::main//input[@name='su_password']")).isDisplayed();
		driver.switchTo().defaultContent();
		Assert.assertTrue("User Name and PassWord Not Displayes this page "+componentpage, flag); 
	}

	
}
