package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//manage is a method
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Actions action=new Actions(driver);//Actions is a class
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		
		driver.findElement(By.linkText("MyFlexiPlan")).click();
		
		driver=null;
		action=null;
		driver.get("https://www.toolsqa.com/");
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Tutorial']")))
		.moveToElement(driver.findElement(By.xpath("//span[text()='QA Practices']"))).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Software Testing']")).click();
		

	}

}
