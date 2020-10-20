package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		//Package(SeleniumSessions)-New-Other-General-File-config.properties(extension should be .properties of a file)
		//We cannot write java code in config.properties file, it’s a simple text file
		/*config.properties is used to define the data, can used to store environment variables
		data we can enter in form of key-value pairs format
		examples
		name=Tom-----key-name,value-Tom
		age=25
		URL= https://www.google.com/
		URL, username, password, Browser=Chrome will be constant throughout our program, these things can be entered in config.properties file
*/
		// we read from properties file in this class
		//in java we have one default class is available, Properties
		//# is used to comment in property
		//to avoid changes in script config.properties is used
		//after some time if url(qa environment to staging environment) is change no need to chnge here in program instead change in config file
		//to remove hardcoded values from code,t create generic code, we use config file
		//if url is used in code 100 times at different places then no need to change in code at every place instead change in url
		//data driven framework as data is driven from config
		Properties prop=new Properties();
		FileInputStream io=new FileInputStream("E:\\Project_Work\\WorkSpace\\NaveenAutolabsJava\\src\\SeleniumSessions\\config.properties");
		prop.load(io);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));//o/p null case sensitive
		System.out.println(prop.getProperty("Age"));
		String url=prop.getProperty("URL");
		
		
		String browsername=prop.getProperty("browser");
		if(browsername.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(browsername.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "E:\\Project_Work\\Selenium\\Selenium software\\geckodriver-v0.27.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		System.out.println(prop.getProperty("URL"));
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.xpath(prop.getProperty("first_name_xpath"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.id(prop.getProperty("last_name_id"))).sendKeys(prop.getProperty("lastname"));
		
	}

}
