package demo;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

/*
 * 
 * */
public class GetScreenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// TakesScreenshot is a interface typecast with webdriver reference (driver)  
		//getScreenshotAs  is method which take argument of OutputType interface method FILE
		
		
		File from=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		int day=LocalDate.now().getDayOfMonth(); 
		int month=LocalDate.now().getMonthValue();
		int hour=LocalDateTime.now().getHour();
		int min=LocalDateTime.now().getMinute();
		
		
		String filename=month+""+day+""+hour+""+min;
		
		File to=new File(".//Files//"+filename+".jpg");
		
		FileHandler.copy(from, to);
		
		
		
	}

}
