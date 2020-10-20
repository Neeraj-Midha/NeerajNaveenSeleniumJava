package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarSelect {

	public static void main(String[] args) {
		// program to select date (18-Sep-2020) from calendar
		
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String date="18-Sep-2017";
		String dateArr[]=date.split("-");
		String day=dateArr[0];
		String month=dateArr[1];
		String year=dateArr[2];
		Select monthSelect=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		monthSelect.selectByVisibleText(month);
		Select yearSelect=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		yearSelect.selectByVisibleText(year);
		///html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/a[1]      absolute xpath to learn selecting date using for loop/tr td concept
		String beforeXpath="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[";
		String afterXpath="]/td[";
		String moreXpath="]/a[1]";
		
		
		final int totalWeekdays=7;
		
		boolean flag=false;
		String dayVal="xyz";
		
		for(int row=1;row<=5;row++){
			
			for(int col=1;col<=totalWeekdays;col++){
				//try catch bcoz at row#1:- td[1] to td[5] no element so system throws exception
				try{
				  dayVal=driver.findElement(By.xpath(beforeXpath+row+afterXpath+col+moreXpath)).getText();
				}
				catch(Exception e){// or NoSuchElementException
				System.out.println("in catch 1");	
				}
				System.out.println(dayVal);
	
				if(dayVal.contains(day)){
					driver.findElement(By.xpath(beforeXpath+row+afterXpath+col+moreXpath)).click();
					flag=true;
					break;//control comes out of the loop, use of break if u dont want unnecessary execution
				}
			}
			
			if(flag){      //why flag- if u want to break outer loop after selecting desired date u cant write only break without flag condition after inner loop 
				//bcoz if u want to select date 18 th and date start from 1th after execution of inner loop control gets out of outer loop also and execution finished
				break;
			}
		}
	}
	}
		
		
		
		
		

	
