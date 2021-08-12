package com.qa.cucumber_selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSiteRegister {
public static final String URL = "http://thedemosite.co.uk/addauser.php";
	
	private WebDriver driver;
	
	@FindBy(name ="username")
	private WebElement usernameInput;
	
	@FindBy(name ="password")
	private WebElement passwordInput;
	
	@FindBy(name ="FormsButton2")
	private WebElement submitButton;
	
	public DemoSiteRegister(WebDriver driver) {
        this.driver = driver;
    }
	
	public void register(String username, String password) {
		Actions register = new Actions(driver);
		register.sendKeys(usernameInput, username)
				.sendKeys(passwordInput, password)
				.click(submitButton)
				.build()
				.perform();
	}
}
