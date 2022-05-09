package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestingTask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtname = driver.findElement(
				By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']"));
		txtname.sendKeys("praveen");
		WebElement txtarea = driver
				.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']"));
		txtarea.sendKeys("khkjdfhjd djkhjkdfhmdflhhdf dhuyhfduh");

	}
}
