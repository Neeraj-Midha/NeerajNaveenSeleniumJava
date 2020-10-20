package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropboxHandle {

	public static void main(String[] args) {
		//how to handle dropdown, using select
		
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Select select=new Select(driver.findElement(By.id("searchDropdownBox")));// Select is a class
		select.selectByVisibleText("Amazon Fashion");
		
	}

}
