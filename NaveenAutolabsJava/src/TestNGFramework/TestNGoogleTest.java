package TestNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGoogleTest {
//one more tab is getting opened after running this class Results of running class TestNGoogleTest
	//there are three test cases, three times browser will be launched and quitted for this class
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
	//if there are three test cases(3 @Test) means three pair(before-test-after) before and after is executed for every @test
	//after executing before method which test is picked to execute(answer is randomly) then after method is executed
	//test cases are independent to each other
	@Test
	 public void googleTitleTest(){
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void googleImgPresent(){//this method checks image is present or not
		boolean isImgPresent=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println(isImgPresent);
	}
	
	@Test
	public void checkGmailLinkPresent(){
		boolean isGmailLinkPresent=driver.findElement(By.xpath("//a[text()='mail']")).isDisplayed();//this test case will be failed bcoz u have written mail instead of Gmail
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
