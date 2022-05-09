package com.pratice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenscart {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenscart.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='loginEmailId']"));
		txtUser.sendKeys("praveen00022@yahoo.com");
		WebElement txtPwd = driver.findElement(By.xpath("//input[@id='loginPassword']"));
		txtPwd.sendKeys("Praveen@123");
		WebElement btnClick = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
		btnClick.click();
		Thread.sleep(5000);
		WebElement btnClick1 = driver.findElement(By.xpath("(//a[@class='nav-link'])[3]"));
		btnClick1.click();
		WebElement btnMobile = driver.findElement(By.xpath("(//img[@class='card-img-top'])[1]"));
		btnMobile.click();
		Thread.sleep(3000);
		WebElement btnBuy = driver
				.findElement(By.xpath("(//button[@class='btn btn-warning btn-long buy buttonKart'])"));
		btnBuy.click();
		WebElement btnGift = driver
				.findElement(By.xpath("//button[@class=\"btn btn-block btn-outline-primary btn-lg\"]"));
		btnGift.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		WebElement btnPromo = driver.findElement(By.xpath("//span[text()='FLAT1000']"));
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		act.doubleClick(btnPromo).perform();
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(4000);

		WebElement btnClick2 = driver.findElement(By.xpath("//span[text()='×']"));
		act.contextClick(btnClick2).perform();
		Thread.sleep(4000);
		WebElement lnkClick = driver.findElement(By.xpath("//div[text()='Remove Promo Code ']"));
		lnkClick.click();

	}

}
