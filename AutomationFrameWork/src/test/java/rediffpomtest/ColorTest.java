package rediffpomtest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterMethod;

public class ColorTest {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver.get("https://www.amazon.in/s?k=one+%2B+plus");

		List<WebElement> list = driver.findElements(By.xpath("//*[@data-deal='DEAL_OF_THE_DAY']"));
		//List<WebElement> list = driver.findElements(By.xpath("//span[@class='celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-badge-text'][normalize-space()='Great Indian Festival']"));
		String exppectedcolor = "#b12704";
		//String exppectedcolor = "#000";
		Thread.sleep(5000);
		for (WebElement ele : list) {
			String color = ele.getCssValue("background-color");
			String hex = Color.fromString(color).asHex();
			if (hex.equals(exppectedcolor)) {
				System.out.println("Background color matches" +hex);
			} else {
				System.out.println("Background  color donot matches" +hex);
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