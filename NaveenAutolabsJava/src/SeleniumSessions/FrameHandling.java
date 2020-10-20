package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		//Frame is a web element, u have to switch from webpage to frame.hierarchy(Browser(Chrome)-Webpage(google.com)-Frame)
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launching chrome
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");//launching webpage
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//frame can take integer or string value
		//no element found exception is either due to bcoz element in frameor wrong xpath etc
		//how to find frame: inspect the element find just above it there is a frame
		//or right click-page source-find frame
		driver.switchTo().frame(2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'com.thoughtworks.selenium.condition')]")).click();
		//how to create your own dynamic xpath a is a tag name like input
		//or
		//driver.findElement(By.linkText("com.thoughtworks.selenium.condition")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageListFrame");//packageListFrame is name of frame
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		
	}

}
