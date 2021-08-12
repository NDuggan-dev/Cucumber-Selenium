package com.qa.cucumber_selenium.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.cucumber_selenium.utilities.WebDriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverHooks {
	
	private WebDriver webDriver;

	@Before("@selenium")
	public void setup() throws Exception {
		if (webDriver == null) {
			webDriver = WebDriverFactory.getDriver();
		}
	}

	@After("@selenium")
	public void teardown() {
		if (webDriver != null) {
			webDriver.quit();
		}
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}
}
