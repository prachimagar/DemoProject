package demotestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class OtherMethodofTestng {
	WebDriver driver;
  
	@Test(invocationCount=2)
  public void chrome() {
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("MarkZukerberg");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook");
	  driver.findElement(By.xpath("//*[@name='login']")).click();
  }
 
  @Test(enabled=false)
  public void firefox() {
	  driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("MarkZukerberg");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook");
	  driver.findElement(By.xpath("//*[@name='login']")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
	  System.setProperty("webdriver.gecko.driver", ".//lib//geckodriver.exe"); 
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
