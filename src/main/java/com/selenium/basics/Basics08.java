package com.selenium.basics;

public class Basics08 {
	
	/**
	 * Different types of Locators in Selenium
	 * 
	 * 1) id - id's will be unique and it will be our first preference to use it.
	 * 
	 * 2) name - this locator is our 2nd choice, it might have some duplicates.
	 * 
	 * 3) className - this is one of the most riskiest attribute, because we can have a lot of
	 * duplicates while using className. Selenium will work on top-down approach, whenever it find the 
	 * WebElemnt first, it will use that element(not recommended). 
	 * 
	 * 4) linkText - Only applicable for link.
	 * 
	 * 5) partialLinkText - this is also only applicable for links. We can pass partial value of the link too.
	 * 
	 * 6) xpath - it is not an attribute. xpath is a address of the webElement on the page
	 * 
	 * 7) css selectors - it is also not an attribute.
	 * 
	 * 8) tag name -  not an attribute, it's a htmltag for a particular element. 
	 * 
	 * NOTE : If we want to use className, as a locator, that must be unique. 
	 */

}
