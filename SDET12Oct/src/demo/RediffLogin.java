package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//To locate weblement on webpage webdriver has method findElement(By) which take argument of by class 
		//By is locator class which helps to locate webelement like textbox,label,checkbox... it return WebElement interface which helps to perform 
		//action on them 
		
		//in By class there are 8 way or method to locate webelement 
		/*
		 * By.id("id value")
		 * By.className("class name value")
		 * By.name("name value")
		 * 
		 * */
		
		driver.findElement(By.id("login1")).sendKeys("Selenium");
		driver.findElement(By.name("passwd")).sendKeys("123456");
		driver.findElement(By.className("signinbtn")).click();
		
		
	}

}
