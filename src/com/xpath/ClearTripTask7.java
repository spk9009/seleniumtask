package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripTask7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement txtfrom = driver.findElement(By.xpath("//input[@id='from_station']"));
		txtfrom.sendKeys("chennai");
		WebElement txtto = driver.findElement(By.xpath("//input[@id='to_station']"));
		txtto.sendKeys("madurai");
		WebElement txtselect = driver.findElement(By.xpath("//select[@id='trainClass']"));
		txtselect.sendKeys("sleeper");
		WebElement date = driver.findElement(By.xpath("//input[@id='dpt_date']"));
		date.sendKeys("26/03/2022");
		WebElement adult = driver.findElement(By.xpath("//select[@id='train_adults']"));
		adult.sendKeys("2");
	}
}
