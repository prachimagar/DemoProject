package rediffpomtest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class PomFactoryTest {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		LoginPageFactory lp=new LoginPageFactory(driver);
		
		lp.doLoginAs("test1", "pass1");
  }
  

}
