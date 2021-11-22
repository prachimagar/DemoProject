package Rediff;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;



public class Login {
	WebDriver driver;

	@Test(dataProvider = "dp")
	public void chrome(String user, String pass) {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.id("login1")).sendKeys(user);

		driver.findElement(By.name("passwd")).sendKeys(pass);

		driver.findElement(By.className("signinbtn")).click();

	}

	@BeforeTest
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterMethod() {
		driver.quit();
	}

	@DataProvider
	public Object[][] dp() {

		Object[][] obj = new Object[4][2];

		obj[0][0] = "User1";
		obj[0][1] = "Pass1";

		obj[1][0] = "User2";
		obj[1][1] = "Pass2";

		obj[2][0] = "User3";
		obj[2][1] = "Pass3";

		obj[3][0] = "User4";
		obj[3][1] = "Pass4";

		return obj;
	}
}