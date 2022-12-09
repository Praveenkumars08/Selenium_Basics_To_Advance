package com.selenium.intermediate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermediate_10_RightClickUsingActionsClass {

	public static void main(String[] args) throws InterruptedException {

		/**
		 * Right click or context click both are same.
		 * contextClick() -> it is a overloaded method, if we don't pass any parameter it will click on the current mouse location.
		 * If we pass the webElement, then it will perform right click on that element.
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/context_menu");

		WebElement rClick = driver.findElement(By.cssSelector("#hot-spot"));

		Actions act = new Actions(driver);
		act.contextClick(rClick).build().perform();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

}
