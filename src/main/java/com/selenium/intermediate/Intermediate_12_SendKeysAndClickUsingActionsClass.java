package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermediate_12_SendKeysAndClickUsingActionsClass {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awesomeqa.com/ui/index.php?route=account/login");

		By eMail = By.id("input-email");
		By pwd = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(eMail), "Test@gmail.com").build().perform();
		act.sendKeys(driver.findElement(pwd), "Test@321").build().perform();
		act.click(driver.findElement(loginBtn)).build().perform();
	}
	
	public static WebElement fElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void mySendKeysWithActions(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(fElement(locator), value).build().perform();
	}
	
	public static void mySendKeysWithClick(By locator) {
		Actions act = new Actions(driver);
		act.click(fElement(locator)).click().build().perform();
	}

}
