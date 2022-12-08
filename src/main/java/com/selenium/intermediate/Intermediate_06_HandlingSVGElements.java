package com.selenium.intermediate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermediate_06_HandlingSVGElements {

	/**
	 * Handling SVG Elements
	 * For SVG elements normal xpath will not work.
	 * There is a formula we have to follow in order to handle svg elements.
	 * //*[local-name()='svg'] --> This is a parent element common for all, we can also add and followed by attributeName ='value'
	 * In order to go for child elements, //*[name()='htmltag'] followed by rest of the syntax.
	 * These are the two function names we have to follow while handling with svg elements.
	 */

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/alerts-map/#/");
		Thread.sleep(3000);

		List<WebElement> stateList = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='state']"));

		for(WebElement e : stateList) {
			String txt = e.getAttribute("id");
			System.out.println(txt);
		}

	}

}
