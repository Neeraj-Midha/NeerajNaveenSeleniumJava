package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedPath {

	public static void main(String[] args) throws InterruptedException {
		//when id ad name is not available and we should not use absolute xpath bcoz if place of element is changed(shifted to other location) then absolute xpath(hierarchy based xpath) is also changed(no of div or tr td etc is also changed)
		//performance wise customized xpath is faster than absolute xpath(not reliable)
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("java");//if By.className cannot find element because of multiple classes u can use like this
		//or
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Java");//input is a HTML tag
		//or
		//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("java");//contains is a function in xpath
		//why contains function is used-lets say if id is dynamic means when id is getting changed after refresh or reload
		//eg previously id=test_123 after refresh id=test_456, so to deal with dynamic ids
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("java");
		//or to deal with dynamic ids u can use ids starts with 
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("java");
		
		//123_test_ or 456_test_
		
		//driver.findElement(By.xpath("//input[ends-with(@id,'test_')]")).sendKeys("java");
		
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();//u can also use By.linkText but if u want to use customized path the use like this
		//below is also possibe if text is available. below example from  DragAndDrop.java 
		//By.xpath("//span[text()='Learning DHTMLX Suite UI']")) 
		//or
		//or
		//driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"))
		
	}

}
