package com.locator;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookTask1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// find and verify the locator of username field-->id="email"
		WebElement txtuserName = driver.findElement(By.id("email"));
		Actions actions = new Actions(driver);
	 actions.keyDown(Keys.SHIFT).sendKeys(txtuserName,"welcome").keyUp(Keys.SHIFT).perform();
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("spk009");
		WebElement findElement = driver.findElement(By.name("login"));
		findElement.click();
		String title = driver.getTitle();
	   System.out.println(title);
	   String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
		
		
		
		
		
		// driver.quit();
		

	}

}
