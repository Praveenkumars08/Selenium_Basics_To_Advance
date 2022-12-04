package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics15 {
	
	public static void main(String[] args) {
		
		/**
		 * Printing all the footer links from amazon.
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@role='presentation']//div/div//ul/li"));
		
		for(WebElement e : footerLinks) {
			String txt = e.getText();
			System.out.println(txt);
		}
	}

}
