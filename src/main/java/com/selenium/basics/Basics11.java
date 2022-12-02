package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics11 {

	public static WebDriver driver;

	public static void main(String[] args) {

		/**
		 * Checking if the WebElement is displayed(), enabled() or not.
		 * Difference between displayed and enabled
		 * isDisplayed() is capable to check for the presence of all kinds of web elements available.
		 * isEnabled() is the method used to verify if the web element is enabled or disabled within the webpage.
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		By searchBox = By.id("twotabsearchtextbox");
		boolean flag = checkEleDisplayed(searchBox);
		if(flag) {
			System.out.println("Element is displayed");
		}
		else {
			System.out.println("Element is not displayed");
		}

		boolean flag2 = checkEleEnabled(searchBox);
		if(flag2) {
			System.out.println("Element is enabled");
		}
		else {
			System.out.println("Element is not enabled");
		}
		
		driver.quit();

	}

	public static WebElement fElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean checkEleDisplayed(By locator) {
		return fElement(locator).isDisplayed();
	}

	public static boolean checkEleEnabled(By locator) {
		return fElement(locator).isEnabled();
	}

}
