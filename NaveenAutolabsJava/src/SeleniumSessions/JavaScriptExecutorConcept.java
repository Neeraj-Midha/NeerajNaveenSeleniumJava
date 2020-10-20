package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		// JavacriptExecutor is like a tonic to boost up performace of the application execution
		// JavascriptExecutor is used when DOM structure of the html code is very complex and ids are very dynamic(frequently changed ie 111 after refresh 222) in nature
		//it is used to highlight the element, scroll up and scroll down, capture the screenshot of element with some border, to highlight that, bug is in this element as we do in manual testing to highlight with circle or rectangle 

		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("neeraj.midha@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		
		//WebElement element=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		
		driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
		//*[@id="loginForm"]/div/div/input
		//flash( loginbtn, driver);
	}
	
	public static void flash(WebElement element, WebDriver driver){
		//JavascriptExecutor js= ((JavascriptExecutor)driver);//((JavascriptExecutor)driver); is like we are creating an object as like new
		String bgcolor=element.getCssValue("backgroundColor"); 
		for(int i=0;i<10;i++){
			
			changeColor("rgb(0,200,0)", element, driver);
			
			changeColor(bgcolor, element, driver);
			
		}
		
	}

	public static void changeColor(String color,WebElement element, WebDriver driver){
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		System.out.println("hi");
		try{
		js.executeScript("arguement[0].style.backgroundColor='"+color+"'", element);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("hi");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
