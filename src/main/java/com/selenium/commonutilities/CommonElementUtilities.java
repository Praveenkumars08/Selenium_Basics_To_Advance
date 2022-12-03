package com.selenium.commonutilities;

import java.util.ArrayList;
import java.util.List;

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

	public String myGetAttribute(By locator, String attrname) {
		String atrValue = fElement(locator).getAttribute(attrname);
		return atrValue;
	}

	public boolean checkEleDisplayed(By locator) {
		return fElement(locator).isDisplayed();
	}

	public boolean checkEleEnabled(By locator) {
		return fElement(locator).isEnabled();
	}

	public List<WebElement> fElements(By locator) {
		return driver.findElements(locator);
	}

	public int fElementsCount(By locator) {
		return fElements(locator).size();
	}

	public ArrayList<String> fElementsTextList(By locator) {
		List<WebElement> eleList = fElements(locator);
		ArrayList<String> ar = new ArrayList<>();
		for(WebElement e : eleList) {
			String txt = e.getText();
			if(txt.length()!=0) {
				ar.add(txt);
			}
		}
		return ar;
	}

}
