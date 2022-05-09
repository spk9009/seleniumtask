package com.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownUP {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement down = driver.findElement(By.xpath("//a[text()='Privacy Notice']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].scrollIntoView(true)", down);

		WebElement up = driver.findElement(By.xpath("//span[text()='Popular picks from Sadar Bazaar | Local shops']"));
		executor.executeScript("arguments[1].scrollIntoView(false)",up,down);

	}

}
