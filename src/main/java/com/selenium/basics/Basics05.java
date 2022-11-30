package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics05 {
	
	public static void main(String[] args) {
		
		/**
		 * Managing Browser Window
		 * driver.manage().window().maximize() -> This method is used to fit the maximum size of the window
		 * driver.manage().window().minimize() -> This method is recently added in selenium 4, used to minimize the window.
		 * driver.manage().window().fullscreen() -> Depends on the OS either it's windows or MAC, it will fit to the screen.
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.quit();
	}

}
