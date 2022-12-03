package com.selenium.basics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics12 {

	public static WebDriver driver;

	public static void main(String[] args) {
		/**
		 * Usage of findElements in selenium
		 * findElement will return a WebElement, but findElements will return a List<WebElement>
		 * why? because selenium is already aware that no.of links or no.of elements available on
		 * the web page are not static all the time.
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		By linkTag = By.tagName("a");
		ArrayList<String> li = fElementsTextList(linkTag);
		System.out.println(li);
	}

	public static List<WebElement> fElements(By locator) {
		return driver.findElements(locator);
	}

	public static int fElementsCount(By locator) {
		return fElements(locator).size();
	}

	public static ArrayList<String> fElementsTextList(By locator) {
		List<WebElement> eleList = fElements(locator);
		ArrayList<String> ar = new ArrayList<>();
		for(WebElement e : eleList) {
			String txt = e.getText();
			if(txt.length()!=0) {
			ar.add(txt);
			}
		}
		return ar;
	}

}
