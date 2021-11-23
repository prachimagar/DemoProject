package demotestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FacebookParameter {
	WebDriver driver;

	@Parameters({"userbox","passbox","loginbtn","user","pass"})
  @Test
  public void facebook(String userbox,String passbox,String loginbtn,String user,String pass) {
	  
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath(userbox)).sendKeys(user);
	  driver.findElement(By.xpath(passbox)).sendKeys(pass);
	  driver.findElement(By.xpath(loginbtn)).click();
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
