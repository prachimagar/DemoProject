package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMulitple {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

		driver.switchTo().frame("iframeResult");

		WebElement cars = driver.findElement(By.xpath("//select[@id='cars']"));

		// Select is class in selenium which is used to handle dropdown
		// In select class there is constructor which take argument of webelement

		Select sel = new Select(cars);
		// isMultiple() is method which return boolean if it return that means we can
		// multiple values
		// and if it false then we can select single value
		System.out.println(sel.isMultiple());

		sel.selectByIndex(0);

		sel.selectByVisibleText("Audi");

		sel.selectByValue("opel");
		
		sel.deselectAll();
		
	

	}

}
