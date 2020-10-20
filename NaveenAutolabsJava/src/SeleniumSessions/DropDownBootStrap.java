package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBootStrap {

	public static void main(String[] args) {
		// when there is no Select tag in html code so we can not write below to select value Dropdown
		//Select select=new Select(driver.findElement(By.id("searchDropdownBox")));// Select is a class
		//select.selectByVisibleText("Amazon Fashion");
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);//increase the time//Exception in thread "main" org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 8.709
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_3");
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();//findElement
		List <WebElement> list=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));//findElements
		System.out.println(list.size());
		
		//to check all the checkbox
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));//web elements
			System.out.println(list.get(i).getText());//text on web elements
			if((list.get(i).getText().trim().equals("Web Development") || list.get(i).getText().trim().equals("Programming Languages")|| list.get(i).getText().trim().equals("Databases"))&&(list.get(i).isSelected()==false)){
				list.get(i).click();
			}
		}
		// to check one checkbox
		/*for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Angular")){
				list.get(i).click();
				break;
			}*/
			
			
		}
		
		
		
		
	

	}


