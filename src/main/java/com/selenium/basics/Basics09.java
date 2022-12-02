package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics09 {

	public static WebDriver driver;

	public static void main(String[] args) {

		/**
		 * Validating error message with the help of getText generic function
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awesomeqa.com/ui/index.php?route=account/login");

		By loginBtn = By.xpath("//input[@value='Login']");
		By errMsg = By.className("alert-danger");
		
		myClick(loginBtn);
		String txt = myGetText(errMsg);
		System.out.println(txt);
		if(txt.equals("Warning: No match for E-Mail Address and/or Password.")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}

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
	
	public static String myGetText(By locator) {
		String txt = fElement(locator).getText();
		return txt;
	}



}
