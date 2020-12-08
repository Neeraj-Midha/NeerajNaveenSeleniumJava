package TestNGFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasic {
	
	//Before annotations are prerequisites before writing testcases, u have to do (eg prerequisities->chrome setup, enter url(before annotations)-perform test(@Test annotations)-post conditions(exit criteria)(@After annotations)
	//priority wise execution-means first execute@BeforeSuite then@BeforeTest-@BeforeClass- pair (@BeforeMethod-@Test-@AfterMethod)- @AfterClass- @AfterTest
	//no main method in testNG class
	//no of test cases in class means no of @test annotations in class
	//for ist test case pair is 	@BeforeMethod,@Test,@AfterMethod
	//for second test case pair is 	@BeforeMethod,@Test,@AfterMethod
	//for 100 test cases it will create 100 pairs
	//if u write multiple method under one annotation, only very first method after annotation will be executed
	@BeforeSuite
	public void setUp(){
		System.out.println("setup for chrome");
	}
	
	
	
	@BeforeTest
	public void launchBrowser(){
		System.out.println("launchBrowser");
	}
	
	@BeforeClass
	public void enterUrl(){
		System.out.println("enter URL");
	}
	
	@BeforeMethod
	public void login(){
		System.out.println("login");
	}
	
	@Test
	public void googleTitleTest(){
		System.out.println("Google Title test");
	}
	
	@Test
	public void searchText(){
		System.out.println("searchText");
	}
	
	
	@AfterMethod
	public void logout(){
		System.out.println("logout");
	}
	
	@AfterTest
	public void deleteAllCookies(){
		System.out.println("after logout deleteAllCookies");
	}
	
	
	@AfterClass
	public void closeBrowser(){
		System.out.println("closeBrowser");
	}
	
	@AfterSuite //it is not executed
	public void generateTestReport(){
		System.out.println("generateTestReport");
	}
	
}
