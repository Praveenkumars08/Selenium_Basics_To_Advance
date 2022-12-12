package com.selenium.advanceconcepts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceConcepts_06_HandlingNonWebElements_Title {
	
	/**
	 * wait for title
	 */

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");

		String title = waitForExactTitle(5, "Demo Site – Registration Form – NxtGen A.I Academy");
		System.out.println(title);
	}

	public static String waitForExactTitle(int timeOut, String plsPassExactTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleIs(plsPassExactTitle))) {
			return driver.getTitle();
		}
		else {
			return null;
		}
	}

	public static String waitForPartialTitle(int timeOut, String partialTitleVal) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleContains(partialTitleVal))) {
			return driver.getTitle();
		}
		else {
			return null;
		}
	}

}
