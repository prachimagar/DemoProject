package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPartialLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//getCurrentUrl() return string of current webpage url
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.linkText("Forgot Password?")).click();
		//System.out.println(driver.getCurrentUrl());
		
		/*
		 * Difference between linkText and partiallink text 
		 * In linktext we have to use exact same text of hyperLink
		 * In partiallinktext we can  use any matching or entire text of hyperLink 
		 * In partialLinkText in verifying username afterlogin example Hi...username welcome
		 * 
		 * */
		
		driver.findElement(By.partialLinkText("?")).click();
	}

}
