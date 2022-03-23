package handlingVariousWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {
public static void main(String[] args) {
	String driver_path ="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",driver_path);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shine.com/registration/");
	
	WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]"));

			boolean status = radioButton.isDisplayed();
			System.out.println("Displayed Status is: "+status);//true

			status = radioButton.isEnabled();
			System.out.println("Enabled Status is: "+status);//true

			status = radioButton.isSelected();
			System.out.println("Initial Selected Status is: "+status);//false

			radioButton.click();

			status = radioButton.isSelected();
			System.out.println("Selected Status is: "+status);//true

			driver.findElement(By.name("gender")).click();

			status = radioButton.isSelected();
			System.out.println("Selected Status is: "+status);//false
			driver.close();
}
}
