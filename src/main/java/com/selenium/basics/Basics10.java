package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics10 {

	public static WebDriver driver;

	public static void main(String[] args) {

		/**
		 * Capturing the attribute value.
		 * NOTE : Whenever we want to enter something in the text field and we need to capture 
		 * what we have entered. we have to use getAttribute("value")
		 * Attribute can have value and cannot have value too.
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/login");

		By eMail = By.id("input-email");

		mySendKeys(eMail, "Test@321");
		String atrVal = myGetAttribute(eMail, "value");
		System.out.println(atrVal);

	}

	public static WebElement fElement(By locator) {
		return driver.findElement(locator);
	}

	public static void mySendKeys(By locator, String val) {
		fElement(locator).sendKeys(val);
	}

	public static String myGetAttribute(By locator, String attrname) {
		String atrValue = fElement(locator).getAttribute(attrname);
		return atrValue;
	}

}
