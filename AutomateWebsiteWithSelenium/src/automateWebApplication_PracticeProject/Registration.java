package automateWebApplication_PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
public static void main(String[] args) {
	String driver_path ="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",driver_path);
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.shine.com/registration/");
	//Registration
	WebElement Check= driver.findElement(By.id("id_privacy"));
	
	WebElement Email= driver.findElement(By.id("id_email"));
	Email.sendKeys("vini@gmail.com");
	
	WebElement Name= driver.findElement(By.id("id_name"));
	Name.sendKeys("vini z");
	
	WebElement Pass= driver.findElement(By.id("id_password"));
	Pass.sendKeys("Vini@123");
	
	WebElement Mobile= driver.findElement(By.id("id_cell_phone"));
	Mobile.sendKeys("8888888888");
	
	WebElement Continue= driver.findElement(By.id("registerButton"));
	Continue.click();
	//Login
	WebElement email =driver.findElement(By.id("email"));
	email.getAttribute("placeholder");
	System.out.println(email.getAttribute("placeholder"));
	
	email.sendKeys("vini@gmail.com");
	email.submit();
	
	WebElement Pass1= driver.findElement(By.id("id_password"));
	Pass1.sendKeys("Vini@123");
	
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	
}
}
