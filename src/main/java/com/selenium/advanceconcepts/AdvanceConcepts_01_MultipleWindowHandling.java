package com.selenium.advanceconcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceConcepts_01_MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")).click(); //link
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]")).click(); //fb
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[3]")).click(); //twitter
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[4]")).click(); //yt

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		String c1Win = it.next();
		String c2Win = it.next();
		String c3Win = it.next();
		String c4Win = it.next();

		driver.switchTo().window(c1Win);
		String c1Title = driver.getTitle();
		System.out.println(c1Title);
		driver.switchTo().window(c2Win);
		String c2Title = driver.getTitle();
		System.out.println(c2Title);
		driver.switchTo().window(c3Win);
		String c3Title = driver.getTitle();
		System.out.println(c3Title);
		driver.switchTo().window(c4Win);
		String c4Title = driver.getTitle();
		System.out.println(c4Title);
		driver.switchTo().window(parentWindow);
		String pWindow = driver.getTitle();
		System.out.println(pWindow);



	}

}
