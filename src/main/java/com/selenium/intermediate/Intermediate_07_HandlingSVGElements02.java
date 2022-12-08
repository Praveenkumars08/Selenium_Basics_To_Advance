package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermediate_07_HandlingSVGElements02 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//label//*[local-name()='svg']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='test']")).sendKeys("Hello Brother");
	}

}
