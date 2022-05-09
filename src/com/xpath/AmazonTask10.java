package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTask10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		//txtSearch.sendKeys("iphone",Keys.ENTER);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(txtSearch,"iphone",Keys.ENTER).keyUp(Keys.SHIFT).perform();
		
		
	}
	
	
	
	

}
