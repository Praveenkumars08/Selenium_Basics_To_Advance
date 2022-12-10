package com.selenium.intermediate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermediate_13_JavaScriptExecutorCommands {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");

		//		JavascriptExecutor js = (JavascriptExecutor) driver;
		//		js.executeScript("alert('Hey, I am alert message')");
		jsAlertMsg("Hello, I am alert pop up");
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		jsConfirmMsg("Please click ok or cancel to continue");
		Thread.sleep(3000);
		Alert alt1 = driver.switchTo().alert();
		alt1.dismiss();
		Thread.sleep(3000);
		jsPromptMsg("Please type some message in the below box");
		Thread.sleep(3000);
		Alert alt2 = driver.switchTo().alert();
		alt2.sendKeys("I love selenium");
		alt2.accept();
		Thread.sleep(3000);
		driver.navigate().to("https://nxtgenaiacademy.com/");
		Thread.sleep(3000);
		jsBack();
		Thread.sleep(3000);
		jsForward();
		Thread.sleep(3000);
		jsRefresh();
	}

	public static void jsAlertMsg(String msg) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+msg+"')");
	}

	public static void jsConfirmMsg(String msg) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("confirm('"+msg+"')");
	}

	public static void jsPromptMsg(String msg) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("prompt('"+msg+"')");
	}

	public static void jsRefresh() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}

	public static void jsForward() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(1)");
	}

	public static void jsBack() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(-1)");
	}



}
