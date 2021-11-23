package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		WebElement table=driver.findElement(By.xpath("//*[@class='dataTable']"));
		
		List<WebElement> allRows=table.findElements(By.tagName("tr"));
		int count=1;
		for (WebElement row : allRows) {
			System.out.println(count+"."+row.getText());
			count++;
		}
		System.out.println("--------------------------");
		String singleRow=allRows.get(8).getText();
		System.out.println(singleRow);
		
		List<WebElement> cellsNine=allRows.get(9).findElements(By.tagName("td"));
		System.out.println("--------------------------");
		String cellone=cellsNine.get(0).getText();
		System.out.println(cellone);
	}

}
