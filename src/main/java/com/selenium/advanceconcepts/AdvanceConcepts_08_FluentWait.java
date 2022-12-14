package com.selenium.advanceconcepts;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceConcepts_08_FluentWait {

	public static void main(String[] args) {

		/**
		 * NOTE : There are only 2 types of wait in Selenium
		 * 1. Implicit wait and 2. Explicit wait
		 * WebDriverWait(class) extends --> FluentWait(class) implements --> Wait (interface) 
		 * There is no such difference between WebDriverWait and FluentWait, syntax wise only
		 * there is a difference. WebDriverWait extends all the methods from the FluentWait class.
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);

		if(wait.until(ExpectedConditions.titleIs("Google"))) {
			String title = driver.getTitle();
			System.out.println(title);
		}

	}

}
