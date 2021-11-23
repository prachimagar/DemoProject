package demotestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FacebookLogin {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("MarkZukerberg");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook");
	  driver.findElement(By.xpath("//*[@name='login']")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		 driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
