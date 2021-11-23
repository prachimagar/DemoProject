package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoMultiWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		//getWindowHandle() get session id of parent window in string
		
		String parentWin=driver.getWindowHandle();
		System.out.println("Parent window id:"+parentWin);
		
	
		
		
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
				driver.close();
			}
		}
		driver.switchTo().window(parentWin);
		System.out.println(driver.getTitle());

	}

}
