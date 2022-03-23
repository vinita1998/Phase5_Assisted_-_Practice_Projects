package com.training.HandlingFileUploads;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploads {
public static void main(String[] args) {
	String driver_path ="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",driver_path);
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shine.com/registration/");

	driver.findElement(By.id("id_name")).sendKeys("vini");
	
	WebElement element = driver.findElement(By.id("id_file"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", element);
	 
     try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     try {
		Runtime.getRuntime().exec("D:\\Screenshot\\FileUpload1.exe");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	//driver.close();
}
}
