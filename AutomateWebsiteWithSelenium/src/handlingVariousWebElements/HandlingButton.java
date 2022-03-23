package handlingVariousWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButton {
public static void main(String[] args) {
	String driver_path ="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",driver_path);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shine.com/registration/");
	WebElement Login = driver.findElement(By.id("tbd1"));

	boolean status = Login.isDisplayed();
	System.out.println("Displaed Status is: "+status);//true

	status = Login.isEnabled();
	System.out.println("Enabled Status is: "+status);//true

	String elementType= Login.getAttribute("type");//submit
	System.out.println(elementType);

	Login.click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	driver.close();
}
}
