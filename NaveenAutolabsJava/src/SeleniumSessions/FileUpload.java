package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		//if u click on browse button manually then it shows windows poppup, u cannot handle windows popup means u cannot click on windows popup so u can use sendKeys instead of clicking Browse button 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\niraj\\Desktop\\pravi\\careers.htm");//double slash
		
		

	}

}
