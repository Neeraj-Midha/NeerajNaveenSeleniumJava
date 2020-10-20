package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsPopuo {

	public static void main(String[] args) throws InterruptedException {
		//window popup(is just like a web page, it has title, url, u can maximize or minimize it) is other than alert or javascript popup
		//u have to switch from one window(chrome window) to another window(popup)(chrome window), perform some operations on another window and get back to parent window
		//advertisements are window popup, u have to switch to advertisement and close it
		//three type of popups
		//1 alert-javascript popup-alert api(accept(),dismiss()) is used to handle this popup
		//2 fileupload popup-browse popup(type should be file, path can be sent through sendKeys)
		//browser window popup-Advertisement popup-windowhandler api(getWindowHandles())
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");//parent window
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handler=driver.getWindowHandles();
		//set does not store the values on basis of indexes, first value stored on index[0], second on index[1], it is not like that.
		//to get values from set object , iterator is required
		//every browser window is associated with unique windowid
		Iterator<String> it= handler.iterator();
		//in starting Iterator pointing to head of set, after it.next() it will point to first space of set , next it.next() it will point to next space in set
		String parentwindow=it.next();
		System.out.println(parentwindow);
		String childwindowpopup=it.next();
		System.out.println(childwindowpopup);
		driver.switchTo().window(childwindowpopup);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();//it will close only one window
		//driver.quit will close all the windows,will close all the chrome windows
		
		//after driver.close() control will lost so we get back to parent window
		
		driver.switchTo().window(parentwindow);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
