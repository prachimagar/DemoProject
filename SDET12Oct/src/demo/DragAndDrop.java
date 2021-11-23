package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, target).perform();
		
	
		
		
	}

}
