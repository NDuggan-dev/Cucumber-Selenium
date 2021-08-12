package com.qa.cucumber_selenium.stepdefs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.cucumber_selenium.pages.BingHome;
import com.qa.cucumber_selenium.pages.PageRepository;
import com.qa.cucumber_selenium.service.DriverHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberSeleniumStepdefs {
	private WebDriver driver;
	private PageRepository pages;
	
	public CucumberSeleniumStepdefs(DriverHooks hooks) {
		this.driver = hooks.getWebDriver();
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		this.pages = new PageRepository();
	}
	
	@Given("the Bing Webpage")
	public void aWebpageURL() {
		pages.bingHome = PageFactory.initElements(driver, BingHome.class);
		driver.get(pages.bingHome.URL);
	}
	
	@When("the user searches for doge")
	public void theUserSearchesForDoge() {
	    pages.bingHome.searchBing("doge");
	}

	@Then("the page title should have doge")
	public void thePageTitleShouldHaveDoge() {
	    driver.getCurrentUrl().contains("doge");
	}
}
