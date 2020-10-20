package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(1000);
		//below popups are javascript or browser popup
		driver.findElement(By.name("proceed")).click();//clicking on Sign in without entering username and password to get popup or alert
		//Alert alert=driver.switchTo().alert();
		//System.out.println(alert.getText());
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		
		//String text=alert.getText();
		String text=driver.switchTo().alert().getText();
		
		if(text.equals("Please enter a valid user name")){
			System.out.println("correct message");
		}
		
		else{
			System.out.println("incorrect message");
		}
		driver.switchTo().alert().accept();
		//or
		//alert.accept();//to click on ok button on alert or popups
		//alert.dismiss();//to click on cancel button on alert or popups
				
		
	}

}
