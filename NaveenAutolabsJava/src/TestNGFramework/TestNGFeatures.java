package TestNGFramework;

import org.testng.annotations.Test;

public class TestNGFeatures {
	//how to create dependency between test cases
	//if you are unable to login then why should u execute homePage or searchPage test cases, if login is failed then other test cases are skipped not to be executed
	//Default test
    //Tests run: 3, Failures: 1, Skips: 2
	@Test
	public void login(){
		System.out.println("login successfully");
		int n=9/0; //to fail this test case
	}

	@Test(dependsOnMethods="login")
	public void homePage(){
		System.out.println("go to home page");
	}
	
	@Test(dependsOnMethods="login")
	public void searchPage(){
		System.out.println("go to search page");
	}
	
}
