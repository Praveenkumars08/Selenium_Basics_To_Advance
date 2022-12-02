package com.selenium.commonutilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonElementUtilities {

	private WebDriver driver;

	public CommonElementUtilities(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement fElement(By locator) {
		return driver.findElement(locator);
	}

	public void mySendKeys(By locator, String value) {
		fElement(locator).sendKeys(value);
	}

	public void myClick(By locator) {
		fElement(locator).click();
	}
	
	public String myGetText(By locator) {
		String txt = fElement(locator).getText();
		return txt;
	}

}
