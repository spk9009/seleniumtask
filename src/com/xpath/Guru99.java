package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	driver.get("https://demo.guru99.com/test/drag_drop.html");
	//	driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		driver.manage().window().maximize();

		WebElement s = driver.findElement(By.id("credit2"));

		WebElement d = driver.findElement(By.id("bank"));

		Actions actions = new Actions(driver);

		actions.dragAndDrop(s, d).perform();

		WebElement s1 = driver.findElement(By.id("fourth"));
		WebElement d1 = driver.findElement(By.id("amt7"));
		actions.dragAndDrop(s1, d1).perform();

		WebElement s2 = driver.findElement(By.id("credit1"));
		WebElement d2 = driver.findElement(By.id("loan"));
		actions.dragAndDrop(s2, d2).perform();
		WebElement s3 = driver.findElement(By.id("fourth"));
		WebElement d3 = driver.findElement(By.id("amt8"));
		actions.dragAndDrop(s3, d3).perform();
		WebElement txt = driver.findElement(By.xpath("//div[contains(@class,'table4_result')]"));
		String text = txt.getText();
		System.out.println(text);
	//	driver.quit();
	}
}
