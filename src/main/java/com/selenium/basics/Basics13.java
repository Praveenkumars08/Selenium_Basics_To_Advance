package com.selenium.basics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics13 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		/**
		 * Handling Drop-downs with the help of Select class
		 * NOTE : Select class will only work if the drop down is having <Select> htmltag
		 */
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		WebElement countryList = driver.findElement(By.id("vfb-13-country"));
		
		Select sel = new Select(countryList);
		sel.selectByIndex(10);
		sel.selectByVisibleText("India");
		sel.selectByValue("Afghanistan");
		
//		By cntry = By.id("vfb-13-country");
//		ArrayList<String> dr = getAllDropDownValues(cntry);
//		System.out.println(dr);
//		int totalCount = fDropDownCount(cntry);
//		System.out.println(totalCount);
		
	}
	
	public static WebElement fElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void mySelectDropDownByIndex(By locator, int value) {
		Select sel = new Select(fElement(locator));
		sel.selectByIndex(value);
	}
	
	public static void mySelectDropDownByVisibleText(By locator, String text) {
		Select sel = new Select(fElement(locator));
		sel.selectByVisibleText(text);
	}
	
	public static void mySelectDropDownByValue(By locator, String value) {
		Select sel = new Select(fElement(locator));
		sel.selectByValue(value);
	}
	
	public static int fDropDownCount(By locator) {
		return getDropDownOptions(locator).size();
	}
	
	public static List<WebElement> getDropDownOptions(By locator) {
		Select sel = new Select(fElement(locator));
		return sel.getOptions();
	}
	
	public static ArrayList<String> getAllDropDownValues(By locator) {
		Select sel = new Select(fElement(locator));
		List<WebElement> eleList =  sel.getOptions();
		ArrayList<String> ar = new ArrayList<>();
		for(WebElement e : eleList) {
			String txt = e.getText();
			ar.add(txt);
		}
		return ar;
	}

}
