package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		// https://ui.freecrm.com/
		
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.name("email")).sendKeys("neeraj.midha@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		Thread.sleep(2000);
		// unable to perform task of this video(unable to find xpath in tr/td form but checkbox can be clicked by below way 
		String name=driver.findElement(By.xpath("//td[contains(text(),'test test')]")).getText();
		System.out.println(name);
		driver.findElement(By.xpath("//td[contains(text(),'test test')]")).click();
		//driver.findElement(By.xpath("//td[contains(text(),'test test')]//preceding-sibling::td//input[@name='id']")).click();//unable to find xpath of ::before so cant click checkbox by this way
		//ctrl+f and enter above commented xpath u can select checkbox in readonly
		
		

	}

}
