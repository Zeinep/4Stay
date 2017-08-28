package com.fourstay.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void waitFor(WebElement elem, int seconds) {
//		WebDriver driver = Driver.getInstance();
//		WebDriverWait wait = new WebDriverWait(driver, seconds);
//		wait.until(ExpectedConditions.visibilityOf(elem));

	}
}
