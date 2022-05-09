package com.pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement btnClick = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnClick.click();
		WebDriverWait driverwait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement txtName = driverwait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First name']")));
		txtName.sendKeys("praveen kumar");
		 WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("saravanan");
		

	}

}
