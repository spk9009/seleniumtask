package com.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUserName = driver.findElement(By.id("email"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','praveen kumar')", txtUserName);
		Object text = executor.executeScript("return arguments[0].getAttribute('value')", txtUserName);
		System.out.println(text);
		WebElement txtPassWord = driver.findElement(By.id("pass"));
		executor.executeScript("arguments[0].setAttribute('value','praveen@123')", txtPassWord);
		Object pass = executor.executeScript("return arguments[0].getAttribute('value')", txtPassWord);
		System.out.println(pass);
		WebElement btnClick = driver.findElement(By.name("login"));
		executor.executeScript("arguments[0].click()", btnClick);
	}

}
