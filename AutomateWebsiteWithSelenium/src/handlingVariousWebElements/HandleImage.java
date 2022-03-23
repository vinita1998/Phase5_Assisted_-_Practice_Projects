package handlingVariousWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleImage {
public static void main(String[] args) {
	String driver_path ="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",driver_path);
	WebDriver driver = new ChromeDriver();
	//handle image
	driver.get("https://www.google.com/");
	//Return the Google Image Title
	String title = driver.findElement(By.id("hplogo")).getAttribute("title");
	System.out.println(title);
	
	
}
}
