package com.selenium.advanceconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceConcepts_04_ExplicitWait {

	static WebDriver driver;

	public static void main(String[] args) {

		/**
		 * visibilityOfElementLocated
		 * Visibility means that the element is not only displayed 
		 * but also has a height and width that is greater than 0.
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");

		By fName = By.id("vfb-5");
		By lName = By.id("vfb-7");

		myWaitForVisibleOfElementSendKeys(fName, 5, "JAVA");
		myWaitForVisibleOfElementSendKeys(lName, 2, "Selenium");


	}

	public static WebElement myWaitForVisibleOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void myWaitForVisibleOfElementSendKeys(By locator, int timeOut, String val) {
		myWaitForVisibleOfElement(locator, timeOut).sendKeys(val);
	}

	public static void myWaitForVisibleOfElementWithClick(By locator, int timeOut) {
		myWaitForVisibleOfElement(locator, timeOut).click();
	}

}
