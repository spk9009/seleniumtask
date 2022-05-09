package com.pratice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		WebElement txtSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearchBox.sendKeys("iphone 13", Keys.ENTER);

		WebElement findElement = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		findElement.click();

		String prtWinId = driver.getWindowHandle();
		System.out.println(prtWinId);
		Set<String> allWinId = driver.getWindowHandles();
		System.out.println(allWinId);

		for (String win : allWinId) {
			// System.out.println(win);
			//
			// System.out.println(!(prtWinId.equals(win)));
			if (!(prtWinId.equals(win))) {
				driver.switchTo().window(win);
			}
		}

		 WebElement btnAdd = driver.findElement(By.id("add-to-cart-button"));
		 btnAdd.click();
	}

}
