package rediffpomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class Login_Invalid_1 {
	WebDriver driver;

	@Test
	public void f() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		LoginPage lp = new LoginPage(driver);

		lp.doLoginAs("test", "test123");
	}

}
