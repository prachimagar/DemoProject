package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Synchronization:when two more software or tool are working there can be 
 * uneven working of softwares to handle this we synchronization
 * Two type
 * 1.Unconditional
 * 2.Conditional
 * 
 * 1.Unconditional:Thread.sleep(millisec) basically stop jvm thread for excution of program
 * Disadvantage even if element is present it will wait unnecessary 
 * 
 * 
 * 2.Conditional:
 * 1.Implicit:Apply entire webpage 
 * 2.Explicit:Apply for particular wait (WebDriverwait and fluentwait)
 * */
public class UnconditionalSync {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[@id='block']")).click();
		
		
		
	}

}
