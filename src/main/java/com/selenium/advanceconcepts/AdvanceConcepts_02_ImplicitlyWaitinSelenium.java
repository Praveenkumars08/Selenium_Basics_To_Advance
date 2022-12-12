package com.selenium.advanceconcepts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceConcepts_02_ImplicitlyWaitinSelenium {

	public static void main(String[] args) {
		/**
		 * Implicit wait is a global wait, it will be applied on all the elements.
		 * We need to apply after the driver declaration.
		 * NOTE : It does not support non web elements -> title, url, alerts
		 * It is not recommended to use implicit wait in the framework.
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
