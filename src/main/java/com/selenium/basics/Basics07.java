package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics07 {

	public static WebDriver driver;

	public static void main(String[] args) {
		
		/**
		 * Performing click operation with the help of generic function
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/login");

		By eMail = By.id("input-email");
		By pwd = By.id("input-password");
		By btn = By.xpath("//input[@value='Login']");

		mySendKeys(eMail, "test@gmail.com");
		mySendKeys(pwd, "Test123");
		myClick(btn);
	}

	public static WebElement fElement(By locator) {
		return driver.findElement(locator);
	}

	public static void mySendKeys(By locator, String val) {
		fElement(locator).sendKeys(val);
	}

	public static void myClick(By locator) {
		fElement(locator).click();
	}

}
