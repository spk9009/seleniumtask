package com.pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement btnClick = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	btnClick.click();
	
	WebElement txtUserName = driver.findElement(By.xpath("//input[@placeholder='First name']"));
	txtUserName.sendKeys("praveen kumar");
	WebElement lastName = driver.findElement(By.name("lastname"));
	lastName.sendKeys("saravanan");
	
	
	
	}

}
