package com.selenium.commonutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUtilities {

	public WebDriver driver;

	public void launchBrowser(String browserName) throws Exception {

		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			throw new Exception("Please pass the valid browser");
		}

	}

	public void launchUrl(String url) {
		if(url!=null) {
			driver.get(url);
		}
		else {
			System.out.println("Please enter valid URL");
		}
	}

	public String getTitle() {
		String title = driver.getTitle();
		if(title!=null) {
			return title;
		}
		else {
			System.out.println("Title is Null");
			return null;
		}
	}

	public String getCurrentPageUrl() {
		String url = driver.getCurrentUrl();
		if(url!=null) {
			return url;
		}
		else {
			System.out.println("URL is null");
			return null;
		}
	}

	public void closeBrowser() {
		if(driver!=null) {
			driver.close();
		}
	}
	
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
