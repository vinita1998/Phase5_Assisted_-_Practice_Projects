package LocatorsWebPageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByID_ByName {
public static void main(String[] args) {
	

	String driver_path ="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",driver_path);
	WebDriver driver = new ChromeDriver();
	String BaseUrl ="https://www.facebook.com/";
	
	
	driver.get(BaseUrl);
	
	WebElement email = driver.findElement(By.id("email"));
	email.getAttribute("placeholder");
	System.out.println(email.getAttribute("placeholder"));
	
	email.sendKeys("vini@gmail.com");
	email.submit();
	
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	//driver.close();
}
}
