package handlingVariousWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTableHTMLTable {
public static void main(String[] args) {
	String driver_path ="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",driver_path);
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("file:///C:/Users/Hello/Desktop/Customer.html");

		boolean status = driver.findElement(By.xpath("/html/body/table")).isDisplayed();
		System.out.println(status);//true

		WebElement customerTable = driver.findElement(By.xpath("/html/body/table"));

		List rows = customerTable.findElements(By.tagName("tr"));
		int row_Count=rows.size();
		System.out.println(row_Count);//4

		List cells = customerTable.findElements(By.tagName("td"));
		int cell_Count = cells.size();
		System.out.println(cell_Count);//12

		int column_Count = cell_Count/row_Count;

		System.out.println(column_Count);//3

		String cellValue = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(cellValue);//Smith

		driver.close();
}
}
