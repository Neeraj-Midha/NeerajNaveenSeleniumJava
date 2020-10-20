package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasicsClass2 {

	public static void main(String[] args) {
		//firefox launch and dwnload geckodriver screen in selenium notes
		//System.setProperty("webdriver.gecko.driver", "E:\\Project_Work\\Selenium\\Selenium software\\geckodriver-v0.27.0-win32\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();//Webdriver is an interface and FirefoxDriver is a class
		//if we run only aboce line it will throw an exception of gecko driver
		//driver.get("https://www.google.com/");
		
		//chrome launch
		//first download chrome driver, screen in selenium notes
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launching chrome//dynamic polymorphism
		driver.get("https://www.google.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title=="Google"){//it is used to compare two address/reference
			System.out.println("correct title");
		}
		else
			System.out.println("incorrect title");
		
		if(title.equals("Google"))//it is used to compare two string values
		{
			System.out.println("equal title");
		}
		else
			System.out.println("not equal title");
		
		int a=10;
		
		if(a==10)
		{
			System.out.println("compared true numeric title");
		}
		else
			System.out.println("not false comparison numeric title");
		
		String S1="neeraj";
		String S2="neeraj";
		
		if(S1==S2){
			System.out.println("neeraj");
		}
		else
		System.out.println("not neeraj");
		
		String S3="midha";
		if(S3=="midha")
		System.out.println("midha");
		else
		System.out.println("not midha");
		
		String s7=new String("naveen");
		String s8=new String("naveen");
		if(s7==s8){
			System.out.println("compare true string with new ");
		
		}
		else
			System.out.println("not false comparison string with new ");
		
		if(s7.equals(s8)){
			System.out.println("compared true string with new ");
		
		}
		else
			System.out.println("not false comparison string with new ");
		
		System.out.println("********");
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.quit();//to close chrome
		
	}
	
}
