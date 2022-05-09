package com.contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement findElement = driver.findElement(By.xpath("//a[@id='overview-tab']"));
		findElement.click();
		WebElement txtpara = driver.findElement(By.xpath("//p[contains(text(),'Greens')]"));
Thread.sleep(3000);
		String text = txtpara.getText();
		System.out.println(text);

	}

}
