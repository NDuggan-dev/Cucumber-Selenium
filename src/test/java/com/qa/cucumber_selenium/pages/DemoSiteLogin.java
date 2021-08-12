package com.qa.cucumber_selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSiteLogin {
	public static final String URL = "http://thedemosite.co.uk/login.php";
	
	private WebDriver driver;
	
	@FindBy(name = "username")
	private WebElement usernameInput;
	
	@FindBy(name = "password")
	private WebElement passwordInput;
	
	@FindBy(name = "FormsButton2")
	private WebElement submitButton;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	private WebElement errorMessage;
	
	public DemoSiteLogin(WebDriver driver) {
        this.driver = driver;
    }
	
	public void login(String username, String password) {
		Actions login = new Actions(driver);
		login.sendKeys(usernameInput, username)
				.sendKeys(passwordInput, password)
				.click(submitButton)
				.build()
				.perform();
	}
	
	public String getErrorMessage() {
		return errorMessage.getText();
	}
}
