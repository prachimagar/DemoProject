package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Yellowbox Testing 
 *Alert/Javascript message/window message can be handle by alert interface in webdriver
 *There are four method in alert interface 
 *1.getText() return string message of alert
 *2.accept() ok button click
 *3.dismiss() cancel click
 *4.sendKeys() send text in message box
 *Simple alert-information displaying only we can accept
 *Confirm Alert information can be accept or dissmiss
 *prompt Alert We can send text in text and can be accept or dissmiss
 *
 * */
public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();

		Alert alert = driver.switchTo().alert();

		Thread.sleep(5000);

		String msg = alert.getText();

		String exmsg = "Please enter your name";

		if (exmsg.equals(msg)) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}
		
		alert.sendKeys("Selenium");
		alert.accept();

	}

}
