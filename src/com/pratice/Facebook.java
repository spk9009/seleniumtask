package com.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	WebElement txtuser = driver.findElement(By.id("email"));
	txtuser.sendKeys("kumar");
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("praveen");
	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
	Thread.sleep(3000);
	driver.navigate().back();
	
	driver.navigate().forward();
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	
	
	
	
	
	}

}
