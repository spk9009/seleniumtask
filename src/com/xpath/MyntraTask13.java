package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTask13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		WebElement txtmobile = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		txtmobile.sendKeys("8667557889");
		WebElement click = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		click.click();
		
		
		
		
	}
	
	
	
	
	
	

}
