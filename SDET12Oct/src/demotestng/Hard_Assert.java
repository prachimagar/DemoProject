package demotestng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Hard_Assert {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  String expectedTitle="Rediffmai";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(expectedTitle, actualTitle);
	  driver.findElement(By.id("login1")).sendKeys("Selenium");
	  driver.findElement(By.id("password")).sendKeys("Selenium3214");
	  driver.findElement(By.name("proceed")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver = new ChromeDriver();
		
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
