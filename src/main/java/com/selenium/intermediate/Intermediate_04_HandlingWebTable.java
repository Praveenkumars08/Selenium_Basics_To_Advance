package com.selenium.intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermediate_04_HandlingWebTable {
	
	public static void main(String[] args) {
		
		/**
		 * Capturing all the values in the table.
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> tableList = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		for(WebElement e : tableList) {
			String txt = e.getText();
			System.out.println(txt);
		}
	}

}
