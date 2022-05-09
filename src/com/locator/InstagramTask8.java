package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramTask8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		WebElement txtuserName = driver.findElement(By.name("username"));
		txtuserName.sendKeys("kumar");
		WebElement txtuserpwd = driver.findElement(By.name("password"));
		txtuserpwd.sendKeys("spk898");
	}

}
