package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoMultiWinOther {

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
			driver.switchTo().window(win);
			if(driver.getTitle().equals("Tech Mahindra")) {
				driver.manage().window().maximize();
			}
			else {
				driver.close();
			}
		}
		
		/*List<String> list=new ArrayList<>(allWin);
		
		for (int i = 0; i < list.size(); i++) {
			
			if(i!=1) {
				driver.switchTo().window(list.get(i));
				driver.close();
			}
			else {
				driver.switchTo().window(list.get(i));
				driver.manage().window().maximize();
			}
		}*/
		
		

	}

}
