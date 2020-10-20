package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for
		WebDriver driver=new SafariDriver();//just put the cursor on WebDriver and SafariDriver and click on import to import 
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

}
