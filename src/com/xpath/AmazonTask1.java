package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement textsearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		textsearch.sendKeys("iphone");
		WebElement nxtclick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		nxtclick.click();
	}

}
