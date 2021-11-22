package rediffpomtest;

/*
 * getScreenshotAs method take argument of OutputType interface which has BYTE,FILE,
 * 
 * Capture the screenshot and store it in the specified location. 
For WebDriver extending TakesScreenshot, this makes a best effortdepending on the browser to return the following in order of preference: 
•Entire page
•Current window
•Visible portion of the current frame
•The screenshot of the entire display containing the browser

For WebElement extending TakesScreenshot, this makes a best effortdepending on the browser to return the following in order of preference:- The entire content of the HTML element- The visible portion of the HTML element
Type Parameters:<X> Return type for getScreenshotAs.Parameters:target target type, @see OutputTypeReturns:Object in which is stored information about the screenshot.Throws:WebDriverException - on failure.UnsupportedOperationException 
- if the underlying implementation does not supportscreenshot capturing.
 * 
 * 
 * */
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class LoginScreenshot {
	WebDriver driver;

	@Test
	public void f() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("Selenium");
		driver.findElement(By.id("password")).sendKeys("Selenium13");
		driver.findElement(By.name("proceed")).click();
		for (int i = 0; i < 5; i++) {
			try {
				boolean flag = driver.findElement(By.xpath("//b[contains(text(),'Wrong username and password combination.')]")).isDisplayed();
				if(flag) {
					//TakesScreenshot is an interface and type casting with webdriver reference variable
				File from=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				int month=LocalDateTime.now().getMonth().getValue();
				int day=LocalDateTime.now().getDayOfMonth();
				int hour=LocalDateTime.now().getHour();
				int min=LocalDateTime.now().getMinute();
				
				String filename=month+""+day+""+hour+""+min;
				
				
				File to=new File(".//src//test//resources//Files//"+filename+".jpg");
				FileHandler.copy(from, to);
				}
			} catch (Exception e) {
				break;
				// TODO: handle exception
			}
		}

	}

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}