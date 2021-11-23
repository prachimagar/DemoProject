package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		List<WebElement> allinput = driver.findElements(By.tagName("input"));
		allinput.get(2).sendKeys("MarkZuckerberg");
		allinput.get(3).sendKeys("MarkZuckerberg");

		driver.findElement(By.tagName("button")).click();
	}

}
