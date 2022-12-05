package com.selenium.intermediate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermediate_02_HandlingAlertAndPopup {
	
	/**
	 * There are 3 types of Alerts which generally occurs. They are
	 * 1. alert() is a method in javascript, we can just accept this type of alert.
	 * 2. prompt() is also a method in JS-> these kind of pop up where we have to enter the value. And also we can accept and cancel.
	 * 3. confirm() it is also a pop, where we need to confirm or cancel
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		String txt = alt.getText();
		alt.accept();
		System.out.println("The message displayed after clicking on btn1 is :"+txt);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		
		Alert alt1 = driver.switchTo().alert();
		String txt1 = alt1.getText();
		alt1.dismiss();
		System.out.println("The message displayed after clicking on btn2 is :"+txt1);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		
		Alert alt2 = driver.switchTo().alert();
		alt2.sendKeys("I love Selenium");
		String txt2 = alt2.getText();
		alt2.accept();
		System.out.println("The message displayed after clicking on btn3 is :"+txt2);
		
		
		
	}

}
