package TestNGFramework;

import org.testng.annotations.Test;

public class TestNGInvocationCount {
//to run testcase multiple times
	
	@Test(invocationCount=10)
	public void checkInvocationCount(){
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	
	
}
