package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		
		// when we search for keyword#testing in google there are multiple suggestion shown how to click on one suggestion(testing tools) as suggestions are dynamic
		//means at once it shows 10 suggestion sometimes it shows different no of suggestions and once testing tools come at no 9 after sometime it shows at no 10
		
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		//findElements
		//SPY ALL THE ENTERIES AS WHOLE-UL-LI-DIV-SECOND DIV-IST DIV-SPAN
		//List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='sbl1']"));
		//u can also use descendant-it will return all the divs(child,child of child etc)
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbl1']"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("testing tools")){
				list.get(i).click();
				
			}
			
			
		}
		
		

	}

}
