package com.qa.cucumber_selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingHome {
	public static final String URL = "http://bing.com";
	
	private WebDriver driver;
	
	@FindBy(name = "q")
	WebElement searchInput;
	
	@FindBy(id ="search_icon")
	WebElement searchButton;
	
	public BingHome(WebDriver driver) {
        this.driver = driver;
    }
	
	public void searchBing(String text) {
		Actions register = new Actions(driver);
		register.sendKeys(searchInput, text)
				.click(searchButton)
				.build()
				.perform();
	}
	
	
	

}
