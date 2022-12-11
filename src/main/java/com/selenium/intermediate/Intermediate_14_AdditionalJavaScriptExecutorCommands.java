package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermediate_14_AdditionalJavaScriptExecutorCommands {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");

		By lText = By.linkText("Checkboxes");
		String title = getTitleUsingJs();
		System.out.println(title);
		jsClick(lText);
	}


	public static void jsClick(By locator) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", driver.findElement(locator));
	}

	public static String getTitleUsingJs() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return js.executeScript("return document.title").toString();
	}

}
