package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics06 {

	public static WebDriver driver;

	public static void main(String[] args) {

		/**
		 * Different ways of creating a WebElement
		 * Create a WebElement and then perform actions like(click, sendKeys, clear, isDisplayed)
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awesomeqa.com/ui/index.php?route=account/login");

		/** 1st approach
		 *driver.findElement(By.id("input-email")).sendKeys("Test@gmail.com");
		 *driver.findElement(By.id("input-password")).sendKeys("Test@123");
		 */

		/** 2nd approach
		 *WebElement email = driver.findElement(By.id("input-email"));
		 *WebElement pwd = driver.findElement(By.id("input-password"));

		 *email.sendKeys("Hello@gmail.com");
		 *pwd.sendKeys("Test@123");
		 */

		/** 3rd approach using By locator 

		 *By eMail = By.id("input-email");
		 *By pwd = By.id("input-password");
		 *WebElement email = driver.findElement(eMail);
		 *WebElement pass = driver.findElement(pwd);
		 *email.sendKeys("Test@gmail.com");
		 *pass.sendKeys("Test@321");
		 */

		/** 4th approach with the help of by locator + generic functions
		 *By email = By.id("input-email");
		 *By pwd = By.id("input-password");
		 *fElement(email).sendKeys("Test@gmail.com");
		 *fElement(pwd).sendKeys("Test@321");
		 */
		
		/** 5th approach with the help of by locator + findElement + actions generic functions
		 *By email = By.id("input-email");
		 *By pwd = By.id("input-password");
		 *mySendKeys(email, "Hello");
		 *mySendKeys(pwd, "hello");
		 */
	}


	public static WebElement fElement(By locator) {
		return driver.findElement(locator);
	}

	public static void mySendKeys(By locator, String value) {
		fElement(locator).sendKeys(value);
	}

}
