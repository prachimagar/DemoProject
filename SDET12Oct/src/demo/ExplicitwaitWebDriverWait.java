package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Synchronization:when two more software or tool are working there can be 
 * uneven working of softwares to handle this we synchronization
 * Two type
 * 1.Unconditional
 * 2.Conditional
 * 
 * 1.Unconditional:Thread.sleep(millisec) basically stop jvm thread for excution of program
 * Disadvantage even if element is present it will wait unnecessary 
 * 
 * 
 * 2.Conditional:
 * 1.Implicit:Apply entire webpage to find any element ,implict wait poll Webpage(dom) for certain amount of time,
 * Default timing is 0  
 * 2.Explicit:Apply for particular element (WebDriverwait and fluentwait)
 * */
public class ExplicitwaitWebDriverWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/search?q=oneplus+9+pro+5");

		WebDriverWait wt = new WebDriverWait(driver, 30);
		int count = 1;
		while (true) {
			try {
				List<WebElement> list = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
				for (WebElement ele : list) {
					if (wt.until(ExpectedConditions.visibilityOf(ele)).isDisplayed()) {
						System.out.println(count + "." + ele.getText());
						count++;
					} else {
						for (int i = 0; i < 15; i++) {
							if (wt.until(ExpectedConditions.visibilityOf(ele)).isDisplayed()) {
								break;
							}
						}
					}

				}

				if (driver.findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed()) {
					Thread.sleep(5000);
					driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
					Thread.sleep(5000);
				}
			} catch (Exception e) {
				break;
			}

		}

	}

}
