package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {

	public static void main(String[] args) {
		//if u dont want to disturb the google chrome means when u execute this program, a new google chrome will be launched, by this u cannot see the google chrome window or icon in taskbar(in previous version u can see the google chrome icon in task bar but u can click it or see the window)
		//your program is executing and u are doing some other work simultaneously without disturbing execution of your program.
		//eg in amazon services u cant see the GUI
		
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		
		//mandatory for using ChromeOptions
		//for mac your chrome version should be grater then 59, for windows chrome version should be greater then 60
		//window-size=1400,800
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("do login");
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("neeraj.midha@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button' and text()='Login']")).click();
		System.out.println("after login title "+driver.getTitle());
		
	}

}
