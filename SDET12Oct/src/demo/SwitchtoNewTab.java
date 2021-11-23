package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoNewTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=oneplus+9r");
		
		//getWindowHandle() get session id of parent window in string
		
		String parentWin=driver.getWindowHandle();
		System.out.println("Parent window id:"+parentWin);
		
		driver.findElement(By.linkText("OnePlus 9R 5G (Carbon Black, 8GB RAM, 128GB Storage)")).click();
		
		
		//getWindowHandles() get session id all  window in set<string>
		Set<String> allWin=driver.getWindowHandles();
		int count=1;
		for (String win : allWin) {
			System.out.println(count+"."+win);
			count++;
		}
		for (String win : allWin) {
			if(!win.equals(parentWin)) {
				driver.switchTo().window(win);
			}
		}
		
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

	}

}
