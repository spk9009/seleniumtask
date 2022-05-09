package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBankTask4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		//DUMMY1
		WebElement txtusername = driver.findElement(By.id("DUMMY1"));
		txtusername.sendKeys("kumar");
		WebElement btnclick = driver.findElement(By.id("user-id-goahead"));
		btnclick.click();
		WebElement txtusername1 = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		txtusername1.sendKeys("praveen");
	
		/*AuthenticationFG.ACCESS_CODE*/
		WebElement txtpwd = driver .findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		txtpwd.sendKeys("spk9009");
	}

}
