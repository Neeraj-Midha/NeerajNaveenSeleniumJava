package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorPath {

	public static void main(String[] args) {
		//everything on web page is called web element
		//inspect the element very first word after <(angular bracket) is called html tag
		//eg in textbox it is name, 
		//by using some properties of web element we can perform some actions on web element
		//properties eg(id, name, size, value)
		//to import WebDriver put the cursor on below WebDriver and click on Import 'WebDriver' org.openqa.selenium
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		//Right click "inspect" on the item you are trying to find the xpath or click F12 and click on leftmost box with arrow to inspect then click on element
		//Right click on the highlighted area on the console.
		//Go to Copy xpath
		
		//https://www.lambdatest.com/blog/selenium-waits-implicit-explicit-fluent-and-sleep/
		//above link to learn about sleep
		/*try{
		Thread.sleep(1000);
		}
		catch(InterruptedException e){
			
		}*/
		
		
		
		//xPath is address of an element
		//By is a class
		
		//below lines to sleep is better than Thread.sleep();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);                  
		  driver.manage().window().maximize();
		  
		  //driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > div > div:nth-child(3) > button")).click();
		  //or
		  driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")).click();
		  
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("neeraj");
		//above full xpath(absolute xpath) should not be used bcoz when element move to some other place then xpath will be disturbed if u move from flatno#201 to flatno#501 but element is same but full xpath is changed and selenium gets confused
		//or we should use only relative xpath
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(".midha");//single quote is allowed here for identifierId and this relative xpath should be used
		//or
		WebElement element ;
		element=driver.findElement(By.id("identifierId"));
		element.sendKeys("@");
		//or
		driver.findElement(By.name("identifier")).sendKeys("gmail");
		//or
		driver.findElement(By.cssSelector("#identifierId")).sendKeys(".com");//id after # or inspect->right click->copy-> copy selector
		
		//driver.findElement(By.linkText("Learn more")).click();//link is always started with tag a
		//or
		//partialLinkText
		//driver.findElement(By.partialLinkText("Learn")).click();
		
		
		//class name is not recommended to use because it can be duplicate, same class name can be used for different element
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();//next button
		
	
	
		
		
		
		
		
		
		
		
	}

}
