package com.contains;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask2 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
	
		WebElement txt = driver.findElement(By.xpath("(//li[contains(@class,'nav_first')])[6]"));
	
		String text = txt.getText();
		System.out.println(text);
	}


}
