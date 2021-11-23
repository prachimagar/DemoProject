package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=oneplus");
		//close is method which close current browser window or tab which is in focus
		//driver.close();
		//quit is method which close all browser window or tab which of that driver instance
		
		driver.findElement(By.linkText("OnePlus Nord CE 5G (Charcoal Ink, 8GB RAM, 128GB Storage)")).click();
		//driver.close();
		
		driver.quit();
		
		
		
		
	}

}
