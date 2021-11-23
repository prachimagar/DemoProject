package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Navigation is interface  which control navigation of browser
 *  In  Navigation  interface there are four method
 *  to(String arg0) which is similar to  get(String arg0) only difference to() method store history of browsing session
 *  back();
 *  forward();
 *  refresh();
 * */
public class NavigateAllMetod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Navigation nav=driver.navigate();
		
		
		nav.to("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Rediffmail")).click();
		
		Thread.sleep(5000);
		
		nav.back();
		
		Thread.sleep(5000);
		
		nav.forward();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("login1")).sendKeys("Selenium");
		
		Thread.sleep(5000);
		
		nav.refresh();
	}

}
