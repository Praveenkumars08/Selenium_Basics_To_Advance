package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermediate_01_HandlingIFrames {

	public static void main(String[] args) {
		
		/**
		 * Frames cannot be handled directly, we need to switch inside to the frame.
		 * driver.switchTo().frame() -> frame() is a overloaded method it accepts parameters as index, id or name, and WebElement
		 * While we are inside the frame, we can't access the outside of the main page, so again we need to switch back to defaultContent
		 * NOTE :- We can also have multiple frames available in the Web Page.
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/iframe");

		driver.switchTo().frame("mce_0_ifr");

		WebElement frame = driver.findElement(By.id("tinymce"));
		frame.sendKeys("Hello");

		driver.switchTo().defaultContent();
	}

}
