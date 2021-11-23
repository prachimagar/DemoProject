package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *Difference between findElement and findElements
 *
 *1.findElement find single matching webelement on entire webpage
 *1.findElements find list or group of matching webelement on entire webpage
 * 
 *2.findElement return WebElement interface
 *2.findElements return List<WebElement> 
 *
 *3.In findElement ellement is not found it will throw NoSuchElementException
 *3.In findElements ellement is not found it will throw not any exception
 *but it will throw indexoutofboundexception when it is greater size of list
 *
 * 
 * */
public class AllCheckbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://echoecho.com/htmlforms09.htm");

		List<WebElement> allCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement c : allCheckBox) {

			if (!c.isSelected()) {
				c.click();
			}
		}

		/*
		 * for (int i = 0; i < allCheckBox.size(); i++) { if
		 * (!allCheckBox.get(i).isSelected()) { allCheckBox.get(i).click(); } }
		 */
		//I have changed
	}

}
