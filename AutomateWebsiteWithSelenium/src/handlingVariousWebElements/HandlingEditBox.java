package handlingVariousWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingEditBox {
	public static void main(String[] args) {
		
		
		String driver_path ="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		WebElement editBox= driver.findElement(By.name("username"));

		boolean status = editBox.isDisplayed();
		
		status = editBox.isEnabled();
		

		String typeofInput = editBox.getAttribute("type");
		
		editBox.sendKeys("ABCD123");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String val = editBox.getAttribute("VALUE");
		System.out.println(val);//ABCD123

		editBox.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
}
}