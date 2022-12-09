package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermediate_09_HandlingMouseOverUsingActionsClass {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * build() and perform() - which means please build this particular action and then finally
		 * perform it on the browser.
		 */
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.linkText("Resources"))).build().perform();
//		driver.findElement(By.xpath("//li[@id='menu-item-44']/a/i")).click();
		
		By resources = By.linkText("Resources");
		By courses = By.xpath("//li[@id='menu-item-44']");
		
		handleL1MenuItems(resources, courses);
	}
	
	public static WebElement fElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void handleL1MenuItems(By parentMenu, By childMenu) {
		Actions act = new Actions(driver);
		act.moveToElement(fElement(parentMenu)).build().perform();
		fElement(childMenu).click();
	}

}
