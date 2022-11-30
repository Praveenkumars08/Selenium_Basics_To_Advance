package com.selenium.basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics04 {

	public static void main(String[] args) throws MalformedURLException {

		/**
		 * Difference between driver.get() and driver.navigate().to()
		 * There is no such difference between these 2 methods, both are help us to navigate the 
		 * respective URL. Both are synonym, navigate().to()-> this method internally calling
		 * driver.get() method. Only syntax wise there is a difference. 
		 * driver.navigate().to()-> to() is a overloaded method here we can pass the
		 * URL in form of String or we can pass the URL with the URL type. There is a URL class
		 * in java with the help of that we can able to do it.
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		/*driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		 */
		driver.navigate().to("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		driver.navigate().to(new URL("https://www.amazon.in"));
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());

	}

}
