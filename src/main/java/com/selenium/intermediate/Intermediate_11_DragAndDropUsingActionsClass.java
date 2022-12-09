package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermediate_11_DragAndDropUsingActionsClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		WebElement sElement = driver.findElement(By.id("column-a"));
		WebElement tElement = driver.findElement(By.id("column-b"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(tElement).moveToElement(sElement).release().build().perform();
		
	}

}
