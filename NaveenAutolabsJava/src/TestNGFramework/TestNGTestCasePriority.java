package TestNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTestCasePriority {
	
	//one more tab is getting opened after running this class Results of running class TestNGoogleTest, u can check test result(passed or failed test cases)
	//if u want to send test report to ur manager then after executing the program-> Right click on Project and click Refresh-> it will create test-output folder
	// then Right click on Index.html->click on properties->copy the below location and paste it on chrome->it will show u no of test cases passed or failed, u can also check chronological view
	//C:\Users\niraj\git\NeerajNaveenSeleniumJava\NaveenAutolabsJava\test-output\index.html
	//advantage of TestNG it gives u test report in form of html report, it is very basic report, good report is Extent report etc
	
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
		//u can do grouping of test cases, and check group wise result in index.html
		@Test(priority=2, groups="googledtl") //priority is a keyword
		 public void googleTitleTest(){
			System.out.println(driver.getTitle());
		}
		
		@Test(priority=1, groups="googledtl")
		public void googleImgPresent(){//this method checks image is present or not
			boolean isImgPresent=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
			System.out.println(isImgPresent);
		}
		
		@Test(priority=5, groups="gmailLink")
		public void checkGmailLinkPresent(){
			boolean isGmailLinkPresent=driver.findElement(By.xpath("//a[text()='mail']")).isDisplayed();//this test case will be failed bcoz u have written mail instead of Gmail
			System.out.println(isGmailLinkPresent);
		}
		
		
		@Test(priority=3, groups="test")
		public void test5(){
			System.out.println("test5");
		}
		
		@Test(priority=4, groups="test")
		public void test4(){
			System.out.println("test4");
		}
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
	

}
