package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics03 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		String browserName = "chrome";
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else {
			throw new Exception("PLEASE PASS VALID BROWSER NAME");
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		System.out.println("Page title is :"+title);
		driver.quit();
	}

}
