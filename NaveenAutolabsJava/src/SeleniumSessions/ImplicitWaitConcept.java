package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		//Thread.Sleep(5000) is for static wait means whenever u write it(on page load or element load(select state haryana,there is ajax and multiple cities in haryana to load from database)) or how many times u have write it, it waits for 5 seconds 
		
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		//timeouts tells when to time out(in below example after 20 seconds), when to throw exception
		//below means wait for max 20 seconds after driver.get for page to load if it is not loaded yet throw an error
		//dynamic if page is loaded in 2 seconds dont wait for further 18 seconds unlike Thread.Sleep
		//some websites are heavy having lot of elements advertisements
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//or
		//Timeouts time=driver.manage().timeouts();//Timeouts is an interface
		//time.pageLoadTimeout(20,TimeUnit.SECONDS);
		
		//below is also dynamic wait
		//after page load sometimes elements are still not loaded for that implicitly wait is used. sometimes page has loaded but some images are broken or not loaded it tells the selenium to wait for max 20 seconds(as per below example) to load the elements
		//for every driver.findElement system waits for max 20 seconds.
		// ElementNotVisibleException after wait is over
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
	}
	 

}
