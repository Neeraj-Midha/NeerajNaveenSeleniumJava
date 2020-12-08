package TestNGFramework;

import org.testng.annotations.Test;

public class TestNGExpectedException {
	//to avoid below expectedExceptions=NumberFormatException.class, after writing this test case will be passed else it will be failed
	//FAILED: chkNumberFrmtExcep
	//java.lang.NumberFormatException
	@Test(expectedExceptions=NumberFormatException.class)
	public void chkNumberFrmtExcep(){
		String x="100A";
		int f=Integer.parseInt(x);//it will throw exception bcoz x=100A, if it is 100 it will not throw exception
	}

}
