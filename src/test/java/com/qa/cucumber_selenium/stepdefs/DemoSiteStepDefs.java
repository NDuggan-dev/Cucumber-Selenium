package com.qa.cucumber_selenium.stepdefs;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.cucumber_selenium.pages.DemoSiteLogin;
import com.qa.cucumber_selenium.pages.DemoSiteRegister;
import com.qa.cucumber_selenium.pages.PageRepository;
import com.qa.cucumber_selenium.service.DriverHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSiteStepDefs {
	
	private WebDriver driver;
	private PageRepository pages;
	
	private String username;
	private String password;
	
	public DemoSiteStepDefs(DriverHooks hooks) {
		this.driver = hooks.getWebDriver();
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		this.pages = new PageRepository();
		
	}
	@Given("the demosite register page")
	public void theDemositeRegisterPage() {
		pages.demoSiteRegister = PageFactory.initElements(driver, DemoSiteRegister.class);
	    driver.get(pages.demoSiteRegister.URL);
	}

	@Given("a username {string}")
	public void aUsername(String string) {
	    this.username = string;
	}

	@Given("a password {string}")
	public void aPassword(String string) {
	    this.password = string;
	}

	@When("the user registers")
	public void theUserRegisters() {
	    pages.demoSiteRegister.register(username, password);
	}

	@When("goes to the login page")
	public void goesToTheLoginPage() {
		pages.demoSiteLogin = PageFactory.initElements(driver, DemoSiteLogin.class);
		driver.get(pages.demoSiteLogin.URL);
	}

	@When("logs in")
	public void logsIn() {
	    pages.demoSiteLogin.login(username, password);
	}

	@Then("verify user is logged in")
	public void verifyUserIsLoggedIn() {
	    assertTrue(pages.demoSiteLogin.getErrorMessage().toLowerCase().contains("successful"));
	}
}
