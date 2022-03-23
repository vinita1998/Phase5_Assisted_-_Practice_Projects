package handlingVariousWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLink {
public static void main(String[] args) throws Throwable {
	String driver_path ="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",driver_path);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	
	WebElement gmail = driver.findElement(By.linkText("Gmail"));

	boolean status = gmail.isDisplayed();
	System.out.println(status);//true

	status = gmail.isEnabled();
	System.out.println(status);//true

	String linkName = gmail.getText();
	System.out.println(linkName);

	gmail.click();
	Thread.sleep(3000);

	driver.close();
}
}
