package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//sometimes page has loaded but some elements(like login button or help button will come after some time)
		//if there is ajax when you select country(India)then state is populated(but it takes sometime) and u need to perform operation on state then put explicit wait before performing operation on state
		//to wait for particular or specific element for certain time regardless of other elements explicit wait is used
		//if you give wait of 40 seconds but element comes after 2 seconds then it will not wait and waste time of 18 seconds, next statement will be executed after 2 seconds
		//Thread.Sleep(3000) cannot be used bcoz as example you give 3000 to wait but elemeny not came in 3 seconds
		//implicitWait is to give 20 second wait for each and every element on webpage but explicit wait to give certain wait(40) to that particular element for other element it is 20 seconds
		clickOn(driver,driver.findElement(By.id("u_0_b")),40);
	}
	
	public static void clickOn(WebDriver driver, WebElement element, int time){
		
		new WebDriverWait(driver,time).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));//u can select other method than elementToBeClickable like elementToBeSelected
		element.click();
		
	}

}
