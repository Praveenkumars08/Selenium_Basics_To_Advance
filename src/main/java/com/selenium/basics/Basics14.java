package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics14 {

	public static WebDriver driver;

	public static void main(String[] args) {

		/**
		 * Handling drop down without using Select Class
		 * With the help of xPath we can able to select it.
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");

		By cntryDropDown = By.xpath("//select/option");
		handleDropDownWithoutSelect(cntryDropDown, "India");
	}

	public static List<WebElement> fElements(By locator) {
		return driver.findElements(locator);
	}

	public static void handleDropDownWithoutSelect(By locator, String val) {
		List<WebElement> eleList = fElements(locator);
		for(WebElement e : eleList) {
			String txt = e.getText();
			if(txt.equals(val)) {
				e.click();
				break;
			}
		}
	}

}
