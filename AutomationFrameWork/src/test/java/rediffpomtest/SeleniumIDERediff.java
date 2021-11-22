package rediffpomtest;

import org.testng.annotations.Test;


	import io.github.bonigarcia.wdm.WebDriverManager;

	import org.testng.annotations.BeforeMethod;
	import org.testng.Assert;


	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.Color;
	import org.testng.annotations.AfterMethod;

	public class SeleniumIDERediff {
		WebDriver driver;
		Map<String, Object> vars = new HashMap<String, Object>();

		@Test
		public void f() throws InterruptedException {
			driver.get("https://www.google.com/");
		    driver.manage().window().maximize();
		    driver.findElement(By.name("q")).sendKeys("rediffmail");
		    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		    driver.findElement(By.xpath("//h3[contains(.,\'Rediff.com: News | Rediffmail | Stock Quotes | Shopping\')]")).click();
		    {
		      WebElement element = driver.findElement(By.linkText("Rediffmail"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    driver.findElement(By.linkText("Rediffmail")).click();
		    Assert.assertEquals(driver.findElement(By.cssSelector(".row:nth-child(1) .form-label")).getText(), "Username");
		    Assert.assertEquals(driver.findElement(By.id("remember")).isSelected(),true);
		    driver.findElement(By.cssSelector(".rgt_ad")).click();
		    driver.findElement(By.linkText("rediff.com")).click();
		    {
		      WebElement element = driver.findElement(By.linkText("Shopping"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    driver.findElement(By.linkText("Shopping")).click();
		    vars.put("var", driver.findElement(By.cssSelector("#div_trdp_scroller > .product_box:nth-child(2) .dealprice")).getText());
		    System.out.println(vars.get("var").toString());
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
