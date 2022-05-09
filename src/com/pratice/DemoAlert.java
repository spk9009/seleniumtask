package com.pratice;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement lnkClick = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')] "));
	lnkClick.click();
	WebElement btnClick = driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')] "));
	btnClick.click();
	Alert al = driver.switchTo().alert();
	al.sendKeys("praveenkumar");
	al.accept();
	WebElement txt = driver.findElement(By.xpath("//p[text()='Hello praveenkumar How are you today']"));
	String text = txt.getText();
	System.out.println(text);
	
	
	}

}
