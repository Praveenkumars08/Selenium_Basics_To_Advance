package com.selenium.advanceconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceConcepts_03_ExplicitWait {

	static WebDriver driver;

	public static void main(String[] args) {
		/**
		 * Explicit wait is applied for a specific element, not for all the elements. 
		 * It can be used for non web elements like alerts, title, URL.
		 * NOTE : It is not a global wait.
		 * presenceOfElementLocated()
		 * An expectation for checking that an element is present on the DOM of a page. 
		 * This does not necessarily mean that the element is visible.
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awesomeqa.com/ui/index.php?route=account/login");

		By eMail = By.id("input-email");
		By pwd = By.id("input-password");
		By btn = By.xpath("//input[@type='submit']");

		myWaitForPresenceOfElementWithSendKeys(eMail, 5, "Test@gmail.com");
		myWaitForPresenceOfElementWithSendKeys(pwd, 2, "Test@123");
		myClickUsingWait(btn, 2);

	}

	public static WebElement myWaitForPresenceOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static void myWaitForPresenceOfElementWithSendKeys(By locator, int timeOut, String val) {
		myWaitForPresenceOfElement(locator, timeOut).sendKeys(val);
	}

	public static void myClickUsingWait(By locator, int timeOut) {
		myWaitForPresenceOfElement(locator, timeOut).click();
	}

}
