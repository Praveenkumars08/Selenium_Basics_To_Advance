package com.selenium.basics;

public class Basics02 {
	
	public static void main(String[] args) {
		
		/**
		 * Different types of Top Casting.
		 * 1) Valid
		 * ChromeDriver driver = new ChromeDriver();
		 * 
		 * 2) WebDriver driver = new ChromeDriver();
		 * driver = new FirefoxDrier();
		 * driver = new EdgeDriver();
		 * used to execute our tests locally
		 * 
		 * 3) Valid but not useful
		 * SearchContext driver = new ChromeDriver();
		 * Because, inside this search context interface, there are only 2 methods available
		 * findElement and findElements.
		 * 
		 * 4) Valid 
		 * RemoteWebDriver driver = new ChromeDriver();
		 * Here, RemoteWebDriver is a class, even though it is a valid statement, but we don't prefer
		 * it. Because it's always a good practice to top casting with the interface. 
		 * 
		 * 5) Valid and Useful
		 * WebDriver driver = new RemoteWebDriver(remoteAddress, Capabilities);
		 * It is used to run our test cases on cloud, docker containers.
		 */
		
	}

}
