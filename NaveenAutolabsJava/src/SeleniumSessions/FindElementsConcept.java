package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		//how to calculate total number of links on webpage
		//and text of these link
		List <WebElement> total_links=driver.findElements(By.tagName("a"));//rhs returns list of Webelements
		
		System.out.println(total_links.size());
		
		for(int i=0;i<total_links.size();i++){
			String linkText=total_links.get(i).getText();//getText used to get the text of web element, total_links.get(i) gives webelement
			System.out.println(linkText);
		}
		
		

	}

}
