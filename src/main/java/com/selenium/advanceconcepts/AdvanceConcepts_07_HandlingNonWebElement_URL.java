package com.selenium.advanceconcepts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceConcepts_07_HandlingNonWebElement_URL {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awesomeqa.com/ui/index.php?route=account/login");
		String url = waitForURLContains(5, "awesomeqa");
		System.out.println(url);

	}

	public static String waitForURL(int timeOut, String plsPassExactURL) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlToBe(plsPassExactURL))) {
			return driver.getCurrentUrl();
		}
		else {
			return null;
		}
	}

	public static String waitForURLContains(int timeOut, String plsPassPartialVal) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlContains(plsPassPartialVal))) {
			return driver.getCurrentUrl();
		}
		else {
			return null;
		}
	}

}
