package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * 	public access modifier gives access to jvm
 *  static is keyword give direct give access without creating object of class  
 *  void it doesnot return anything
 *  main(String[] args) main is method name string[] args is array of string
 * 
 * 
 * 
 * 
 * */


public class FirstSelenium {

	
	
	public	static void main(String[] args) {
		
		System.out.println("Hello Selenium");
		
		
		//we cannot create object of interface webdriver because it abstract below way is incorrect way 
		//WebDriver driver=new WebDriver();
		
		/*WebDriver is interface which is implementated in chromedriver,firefoxdriver,edgedriver,safaridriver
		 *operadriver class
		 *Webdriver is parent class and its all method are executed in chromedriver,firefoxdriver,edgedriver,safaridriver
		 *operadriver class
		 * */
		
		//This is a correct way of using selenium webdriver not preferred way
		//This driver reference variable will control only chromedriver class it cannot be used for cross browser testing
		
		//ChromeDriver driver=new ChromeDriver();
		
		
		//This is a correct way of using selenium webdriver and also preferred way 
		//This driver reference variable will control only chromedriver class but also other class that can be used for cross browser testing
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		//ChromeDriver class has constructor which helps to launch chromebrowser on any port which available on computer
		WebDriver driver=new ChromeDriver();
	
		
	}
	
	

}
