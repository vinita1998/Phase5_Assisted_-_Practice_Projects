package handlingVariousWebElements;

import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
public class HandleDropdown {
public static void main(String[] args) {
	//String driver_path ="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver","D:\\Phase-5\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	// Launch Website  
    driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   


//Using Select class for selecting value from dropdown  
    Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
    dropdown.selectByVisibleText("Database Testing");  
    
    // Close the Browser  
        driver.close();  
}
}
