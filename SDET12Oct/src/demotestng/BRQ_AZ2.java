package demotestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BRQ_AZ2 {

	WebDriver driver;
	String parentWin;

	@Test
	public void Whenuseropenchromebrowser() {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(dependsOnMethods = "Whenuseropenchromebrowser")
	public void openamazon() {
		driver.get("https://www.amazon.in");
		parentWin = driver.getWindowHandle();
	}

	@Test(dependsOnMethods = "openamazon")
	public void searchproduct() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("google pixel 5", Keys.ENTER);
		driver.findElement(By.linkText("Google Pixel 5 Sorta Sage, 8GB RAM, 128GB Storage")).click();
	}

	@Test(dependsOnMethods = "searchproduct")
	public void addtocart() {
		Set<String> allWin = driver.getWindowHandles();
		for (String win : allWin) {
			if (!win.equals(parentWin)) {
				driver.switchTo().window(win);
			}
		}

		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		for (int i = 0; i < 5; i++) {
			try {
				if (driver.findElement(By.xpath("//*[@id='attach-close_sideSheet-link']")).isDisplayed()) {
					driver.findElement(By.xpath("//*[@id='attach-close_sideSheet-link']")).click();
				}
				else {
					continue;
				}
			} catch (Exception e) {
				break;
			}
		}
	}

	@Test(dependsOnMethods="addtocart")
	public void removefromcart() {
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@data-feature-id='delete']/span")).click();

		String empty = driver.findElement(By.xpath("//h1[contains(text(),'Your Amazon Cart is empty.')]")).getText();

		if (empty.equals("Your Amazon Cart is empty.")) {
			System.out.println("Product removed");
		} else {
			System.out.println("Product Not removed");
		}
	}

}
