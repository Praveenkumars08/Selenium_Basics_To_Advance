package com.selenium.intermediate;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermediate_08_HandlingShadowDOMElements {
	
	public static void main(String[] args) throws InterruptedException {
		/**
		 * NOTE : if shadow-root (close) -> this is a blocker for automation. No automation tool can handle it.
		 * We have to make sure that shadow-root(open) -> it should be opened.
		 */
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
		driver.switchTo().frame("pact");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement el = (WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"input#tea\")");
		el.sendKeys("Yes, I love tea");
		Thread.sleep(3000);
		
		WebElement food = (WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
		food.sendKeys("I like to have a pizza");
		driver.switchTo().defaultContent();
	}

}
