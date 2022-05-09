package com.pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement btnClick = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnClick.click();
		WebElement dropDay = driver.findElement(By.id("day"));
		Select select = new Select(dropDay);
		select.selectByValue("10");
		WebElement dropMonth = driver.findElement(By.id("month"));
		Select sel1 = new Select(dropMonth);
		sel1.selectByVisibleText("Oct");
		WebElement dropYear = driver.findElement(By.id("year"));
	Select sel2 = new Select(dropYear);
	sel2.selectByIndex(32);
	}
}
