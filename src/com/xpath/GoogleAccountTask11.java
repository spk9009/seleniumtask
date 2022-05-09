package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccountTask11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		txtfirstname.sendKeys("praveen");
		WebElement txtlastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		txtlastname.sendKeys("kumar");
		WebElement txtusername = driver.findElement(By.xpath("//input[@id='username']"));
		txtusername.sendKeys("praveen");
		WebElement txtpwd = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[4]"));
		txtpwd.sendKeys("kumar458754");
		WebElement txtpwd1 = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[5]"));
		txtpwd1.sendKeys("kumar458754");
		WebElement btnnext = driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
		btnnext.click();

	}

}
