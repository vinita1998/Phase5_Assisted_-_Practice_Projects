package handlingVariousWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleImageLink {
public static void main(String[] args) {
	String driver_path ="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",driver_path);
	WebDriver driver = new ChromeDriver();
	
	
	
	driver.get("https://www.selenium.dev/");
	WebElement testBirds = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/a/img"));

	System.out.println(testBirds.isDisplayed());//true

	System.out.println(testBirds.isEnabled());//true

	testBirds.click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.close();
}
}
