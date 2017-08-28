package com.fourstay.tests;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.fourstay.pages.HomePage;
import com.fourstay.pages.UserAccountPage;
import com.fourstay.utilities.Config;
import com.fourstay.utilities.Driver;
import com.fourstay.utilities.Page;

public class LoginHostTest {
	WebDriver driver;

	@Before
	public void setUp() {
		driver = Driver.getInstance();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() {
		driver.get(Config.getProperty("url"));

		HomePage home = new HomePage();
		home.loginLink.click();
		home.email.sendKeys(Config.getProperty("host_username"));
		Page.sleep(500);
		home.password.sendKeys(Config.getProperty("host_password"));
		Page.sleep(500);
		home.loginBtn.click();

		UserAccountPage userAccount = PageFactory.initElements(driver, UserAccountPage.class);
		assertTrue(userAccount.accountHolderName.isDisplayed());
		String expected = "Currently no listings by";
		assertTrue(userAccount.message.getText().contains(expected));

	}
}
