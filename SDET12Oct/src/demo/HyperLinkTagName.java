package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rediff.com/");

		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		int count = 1;
		for (WebElement link : allLink) {
			System.out.println(count + "." + link.getText());
			count++;
		}

	}

}
