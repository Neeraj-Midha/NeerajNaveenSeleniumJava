package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownBootStrapExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);//increase the time//Exception in thread "main" org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 8.709
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		List<WebElement> list=driver.findElements(By.xpath("div[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a[text()='Another action']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			
			if(list.get(i).getText().equals("Another action")){
				list.get(i).click();
			}
			
		}

	}

}
