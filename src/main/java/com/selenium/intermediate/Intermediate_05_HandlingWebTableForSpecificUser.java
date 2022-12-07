package com.selenium.intermediate;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermediate_05_HandlingWebTableForSpecificUser {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
		List<String> uList = getUserData("Kevin.Mathews");
		System.out.println(uList);
	}
	
	public static List<String> getUserData(String plsPassExactUserName) {
		driver.findElement(By.xpath("//table[@id='resultTable']//td/input/parent::td/following-sibling::td/a[text()='"+plsPassExactUserName+"']/parent::td/preceding-sibling::td/input")).click();
		List<WebElement> userList = driver.findElements(By.xpath("//table[@id='resultTable']//td/input/parent::td/following-sibling::td/a[text()='"+plsPassExactUserName+"']/parent::td/following-sibling::td"));
		ArrayList<String> ar = new ArrayList<>();
		for(WebElement e : userList) {
			String txt = e.getText();
			ar.add(txt);
		}
		return ar;
	}

}
