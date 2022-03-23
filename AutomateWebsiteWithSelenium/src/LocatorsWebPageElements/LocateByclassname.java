package LocatorsWebPageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByclassname {
	public static void main(String[] args) {
		String driver_path ="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		WebDriver driver = new ChromeDriver();
		String BaseUrl ="https://www.facebook.com/";
		
		
		driver.get(BaseUrl);
		WebElement email1=driver.findElement(By.id("email"));
		WebElement email2=driver.findElement(By.name("email"));
		
		System.out.println(email1.equals(email2));
		WebElement email3=driver.findElement(By.className("_6lux"));
		
		System.out.println(email1.equals(email3));
		driver.close();
	}
}
