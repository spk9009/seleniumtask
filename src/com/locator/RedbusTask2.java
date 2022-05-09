package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusTask2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		// id="scr"
		WebElement txtfrom = driver.findElement(By.id("scr"));
		txtfrom.sendKeys("thiruvanmiyur");
		// id="dest"
		WebElement txtto = driver.findElement(By.id("dest"));
		txtto.sendKeys("tuticorin");
		
		

	}

}
