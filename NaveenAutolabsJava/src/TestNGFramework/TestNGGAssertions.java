package TestNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGGAssertions {
	// there is no use of writing testcases until writing assertion
	//in assert u can write actual and expected and based on that test case is passed or failed is shown
WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		
	}
	
	@Test
	 public void googleTitleTest(){
		String title=driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Google123", "title is not matched neeraj");//click on Results of running class TestNGGAssertions, it is showing java.lang.AssertionError, now click on this exception it will show actual and expected result
		//Assert.assertEquals(title, "Google", "title is not matched");
	}
	@Test
	
	public void googleLogoTest(){
		boolean logoPresent=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println(logoPresent);
		Assert.assertTrue(logoPresent);
		Assert.assertEquals(logoPresent, true,"logo is not present midha");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	

}
