package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/index.html?e=1");
		// this | (pipeline symbol) will behave like or operator
		driver.findElement(By.xpath("//input[@class='form-control' and @name='password'] | // input[@name='password']")).sendKeys("neeraj");
		
		// after some time class is changed from 'form-control' to 'form1-control' then system identify the element using input[@name='password']")).sendKeys("neeraj")
		//below will also work
		//driver.findElement(By.xpath("//input[@class='form-control' and @name='password'] | // input[@name='password']")).sendKeys("neeraj");
		
		//indexes and use of * instead of tag name
		//if there are multiple elements having class='form-control'
		driver.findElement(By.xpath("//*[@class='form-control'][1]")).sendKeys("neeraj");
		
	}

}
