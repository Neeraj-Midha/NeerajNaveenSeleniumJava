package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();comment it due to below reasons
		//instead of launching chrome check the results on console, testing is happening behind the scene
		//it is available till java version 3.0 after that u have to download htmlunitdriver jar file
		//there is no browser for html
		//advantage
		//no browser launching
		//very fast-execution of test cases and script-used for small scripts to check the results-when u are in hurry r 
		//HtmlUnitDriver is also called ghost driver(headless browser) because nothing is visible
		//not suitable for Action class, user actions, mousemovements, doubleclick,dranadndrop. bcoz no browser(eg chrome) is getting launched
		//many headless browser are availabe in markit
			//HtmlUnitDriver for java
			//PhantomJS for java script
		//used for smoke and sanity testing purposes
		
		WebDriver driver=new HtmlUnitDriver();//HtmlUnitDriver is a class which is implementing WebDriver interface 
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com/");
		System.out.println("before"+driver.getTitle());
		driver.navigate().to("https://www.amazon.com/");
		System.out.println("after"+driver.getTitle());
	}

}
