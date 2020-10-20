package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarJavaScriptExecuter {

	public static void main(String[] args) {
		//previous date picking method in calendar is lengthy, there is matrix of n(rows)*n(column), in which we find day, complexity O(n)square, slow for highest days(29,30,31)
		//selenium cannot change dom structure of html or change default value of element(date), it is done by javascript
		//javascript disadvantage-u can add 32-12-2017(but it is not valid date), javascript does not check it but previous calendar method catch this bcoz 32 is not found 
		//through driver.findElement(By.xpath(beforeXpath+row+afterXpath+col+moreXpath)).getText() and throws exception
		
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		WebElement element=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateVal="03-10-2020";
		selectDateByJS(driver,element, dateVal);
	}
	
	public static void selectDateByJS(WebDriver driver,WebElement element, String dateVal){
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguements[0].setAttribute('value', '"+dateVal+"');", element);
	}

}
