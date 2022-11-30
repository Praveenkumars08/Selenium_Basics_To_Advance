package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics01 {
	
	public static void main(String[] args) {
		
		/**
		 * Difference between close() and quit()
		 * close() - After closing the driver, then we perform any type actions like getTitle() or getCurrentUrl() it will throw the below exception 
		 * org.openqa.selenium.NoSuchSessionException: invalid session id
		 * quit() - After using driver.quit(), again if we perform any type actions like getTitle() or getCurrentUrl() it will throw the below exception
		 * org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		driver.getCurrentUrl();
	}

}
