package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get(String  arg0)  is method of webdriver which load new webpage in browser window
		driver.get("https://www.google.com");
		//getTitle() is a method of webdriver which return title of webpage in string 
		String title=driver.getTitle();
		System.out.println(title);
		String expectedTitle="Google";
		
		if(expectedTitle.equals(title)) {
			System.out.println("Test case passed");
		}
		
		else {
			System.out.println("Test case failed");
		}
		
		
	}

}
