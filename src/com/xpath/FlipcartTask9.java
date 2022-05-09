package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartTask9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement txtuser = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtuser.sendKeys("praveen");
		WebElement txtpwd = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		txtpwd.sendKeys("kumar98787");
		WebElement btnclick = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		btnclick.click();
	}
}
