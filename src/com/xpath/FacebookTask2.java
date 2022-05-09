package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtuserlogin = driver.findElement(By.xpath("//input[@id='email']"));
		txtuserlogin.sendKeys("praveen");
		
		WebElement txtpwd = driver.findElement(By.xpath("//input[@id='pass']"));
		txtpwd.sendKeys("spk897");
		WebElement btnlogin = driver.findElement(By.xpath("//button[@id='u_0_d_mi']"));
		btnlogin.click();
	}
}
