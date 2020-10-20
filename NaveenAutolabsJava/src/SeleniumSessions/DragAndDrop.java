package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Project_Work\\Selenium\\Selenium software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		Actions action=new Actions(driver);
		//if text available like it(no id, no xpath(absolute xpath)) <li class="dhx_list-item dhx_list-item--text dhx_list-item--selected dhx_list-item--focus dhx_list-item--drag" dhx_id="u1558367722704">Zend Framework in Action</li>
		action.clickAndHold(driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"))).moveToElement(driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"))).release().build().perform();
		
	}

}
