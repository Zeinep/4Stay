package com.fourstay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fourstay.utilities.Driver;
import com.fourstay.utilities.Page;

public class HomePage {
	// this class will hold all the web elements and the actions from the home
	// page of the four stay applicaiton
	private WebDriver driver;

	public HomePage() {
		this.driver = Driver.getInstance();
		PageFactory.initElements(driver, this);
	}

	// @FindBy annotation from selenium, it holds the locator for webelement
	// xpath, id, name, linkText, partialLinkText, css, tagName

	@FindBy(css = "[data-target='#modal-login']")
	public WebElement loginLink;

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "key")
	public WebElement password;

	@FindBy(id = "btn-login")
	public WebElement loginBtn;

	@FindBy(xpath = "//form[@id='login-form']//div/span")
	public WebElement incorrectPasswordMessage;

	// search
	// login
	public void login(String userEmail, String userPassword) {
		loginLink.click();
		email.sendKeys(userEmail);
		password.sendKeys(userPassword);
		loginBtn.click();
	}

}
