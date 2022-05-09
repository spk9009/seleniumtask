package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinhotelTask10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement txtuserName = driver.findElement(By.id("username"));
		txtuserName.sendKeys("kumar");
		WebElement txtpwd = driver.findElement(By.id("password"));
		txtpwd.sendKeys("kumar786768");
		WebElement btnclick = driver.findElement(By.id("login"));
		btnclick.click();
	}

}
