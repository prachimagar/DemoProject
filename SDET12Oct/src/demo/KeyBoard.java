package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Actions is class in selenium which interact with api of mouse and keyboard
 * Using actions class we can perform complex user gesture like drag and drop,right click,double click.....
 * and also different keyboard events like enter,ctrl,alt up,down 
 * 
 * Actions is class there is constructor  which take argument of webdriver (driver) reference 
 * perform() in actions class is used to execute the method and it is given at the end
 * build() in action is method which is used for composite actions(multiple events)  
 * 
 * */
public class KeyBoard {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.americangolf.co.uk/");
		
		WebElement target=driver.findElement(By.xpath("//div[@id='header-navigation']/div[1]/ul[1]/li[2]/a[1]"));
		
		Actions act=new Actions(driver);
		//mouse hover action
		act.moveToElement(target).perform();
		
		Thread.sleep(5000);
		
		WebElement putter=driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[3]/ul/li/a/span"));
		
		//left click
		act.click(putter).perform();
		
		//right click 
		//act.contextClick(target).perform();
		
		
		
	}

}
