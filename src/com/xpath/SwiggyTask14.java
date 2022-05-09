package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTask14 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement click = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		click.click();
		WebElement txtmobile = driver.findElement(By.xpath("//input[@id='mobile']"));
		txtmobile.sendKeys("8763563873");
		WebElement btnclick = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btnclick.click();

	}

}
