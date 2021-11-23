package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *Frame is tag in html which  are used for adding another webpage 
 *if  try to find element it will give nosuchelementexception
 *first we have to switch frame then perform any action 
 *
 * */
public class FrameWithinFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		//driver.switchTo() return targetlocator interface 
	
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@src='MultipleFrames.html']")));

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@src='SingleFrame.html']")));
		
		driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Selenium");

	

		

	}

}
