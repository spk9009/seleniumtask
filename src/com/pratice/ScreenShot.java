package com.pratice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args, int FILE) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\godsp\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ScreenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(ScreenshotAs);
		FileUtils.copyFile(ScreenshotAs,
				new File("C:\\Users\\godsp\\OneDrive\\Desktop\\Praveen\\java\\flipkarthomepage.png"));

	}

}
