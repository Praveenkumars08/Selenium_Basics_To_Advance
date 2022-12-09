package com.selenium.commonutilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonElementUtilities {

	private WebDriver driver;
	private Select sel;
	private Actions act;

	public CommonElementUtilities(WebDriver driver) {
		this.driver=driver;
		act = new Actions(driver);
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

	/**
	 * **********Utilities for Select Class*********
	 */

	public void mySelectDropDownByIndex(By locator, int value) {
		sel = new Select(fElement(locator));
		sel.selectByIndex(value);
	}

	public void mySelectDropDownByVisibleText(By locator, String text) {
		sel = new Select(fElement(locator));
		sel.selectByVisibleText(text);
	}

	public void mySelectDropDownByValue(By locator, String value) {
		sel = new Select(fElement(locator));
		sel.selectByValue(value);
	}

	public int fDropDownCount(By locator) {
		return getDropDownOptions(locator).size();
	}

	public List<WebElement> getDropDownOptions(By locator) {
		sel = new Select(fElement(locator));
		return sel.getOptions();
	}

	public ArrayList<String> getAllDropDownValues(By locator) {
		sel = new Select(fElement(locator));
		List<WebElement> eleList =  sel.getOptions();
		ArrayList<String> ar = new ArrayList<>();
		for(WebElement e : eleList) {
			String txt = e.getText();
			ar.add(txt);
		}
		return ar;
	}

	public void handleDropDownWithoutSelect(By locator, String val) {
		List<WebElement> eleList = fElements(locator);
		for(WebElement e : eleList) {
			String txt = e.getText();
			if(txt.equals(val)) {
				e.click();
				break;
			}
		}
	}

	/**
	 * ********Utilities for Actions Class***************
	 */

	public void mySendKeysWithActions(By locator, String value) {
		act.sendKeys(fElement(locator), value).build().perform();
	}

	public void mySendKeysWithClick(By locator) {
		act.click(fElement(locator)).click().build().perform();
	}

}
