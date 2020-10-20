package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibility {

	public static void main(String[] args) throws InterruptedException {
		//isDisplayed() method used to verify that webelement(can check all kind of elements like button, checkbox etc) is available or not on webpage
		//isEnabled() is used to check webelemnt is enabled or not, it is primarily used for button
		//isSelected() used for dropdown,checkbox,radio button that they are selected or not
		
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.browserstack.com/users/sign_up");
		boolean b1=driver.findElement(By.id("user_submit")).isDisplayed();
		System.out.println(b1);
		boolean b2=driver.findElement(By.id("user_submit")).isEnabled();
		System.out.println(b2);
		boolean b3=driver.findElement(By.id("tnc_checkbox")).isSelected();
		System.out.println(b3);
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("accept-cookie-notification")).click();//to click on We have cookies
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("tnc_checkbox")).click();
		
		boolean b4=driver.findElement(By.id("tnc_checkbox")).isSelected();
		System.out.println(b4);

	}

}
