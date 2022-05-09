package com.xpath;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://sprint.com/");
		WebElement btncook = driver.findElement(By.xpath("//button[@class='phx-button phx-button--primary']"));
		btncook.click();
		
		WebElement lnkphone = driver.findElement(By.xpath("//a[text()='Phones & devices']"));
		Actions action = new Actions(driver);
		action.moveToElement(lnkphone).perform();
		WebElement link5g = driver.findElement(By.xpath("//a[text()='5G phones']"));
		link5g.click();
		WebElement txtfoot = driver.findElement(By.xpath("//a[contains(@id,'digital-footer-bottom-link-bottom-9')]"));
		String text = txtfoot.getText();
		System.out.println(text);
		
		//Thread.sleep(6000);
		
		
		
	}

}
