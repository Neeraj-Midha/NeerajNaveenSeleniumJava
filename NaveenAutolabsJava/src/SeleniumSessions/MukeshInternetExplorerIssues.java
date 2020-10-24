package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MukeshInternetExplorerIssues {

	public static void main(String[] args) {
		//check ie flow
		// Zooming Setting
		//Protected Mode Setting
		//Xpath changes in IE browser
		//sendKeys performance 
		System.setProperty("webdriver.ie.driver", "E:\\Project_Work\\Selenium\\Selenium software\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();//if u run the progran with this statement only system throws  java.lang.IllegalStateException, to remove write System.setProperty
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}

}
