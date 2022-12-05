package com.selenium.intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermediate_03_HandlingAuthPopup {

	public static void main(String[] args) {

		/**
		 * Auth pop-up : this is an another kind of popup not JS popup
		 * Limitations 
		 * 1. What if the username or password is having @ it can't handle.
		 * 2. We dont' have any methods to switch to the authentication pop up.
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String uName = "admin";
		String pwd = "admin";

		//driver.get("https://"+uName+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");-> this also works
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		String txt = driver.findElement(By.tagName("p")).getText();
		System.out.println(txt);

	}

}
