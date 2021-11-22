package rediffpomtest;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import util.HelperMethod;

public class TestHelper {
	
	WebDriver driver;
	HelperMethod hp;
  @Test(enabled=true)
  public void f() {
	 hp.launchBrowser("ChROME");
	 hp.openApp("https://mail.rediff.com/cgi-bin/login.cgi");
	 hp.titleCompare("Rediffmail");
	 hp.enterText(By.id("login1"), "Selenium");
	 hp.enterText(By.id("password"), "Selenium321");
	 hp.clickBtn(By.name("proceed"));
	 hp.getScreenShot(".//src//test//resources//Files");
	 hp.scroll(0, 1000);
	 
	 
	  
  }
  
  @BeforeTest
  public void bm() {
	  hp=new HelperMethod(driver);
  }
  
  @Test(dataProvider="dp")
  public void readData(HashMap<String, String> map) {
	  System.out.println(map.get("UserName")+"||"+ map.get("Password"));
  }
  
  @DataProvider
  public Object[][] dp(){
	 
	 return  hp.dataReader(".//src//test//resources//Files//RediffLoginData.xlsx");
	  
	  
  }
  
}