package demo;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOtherMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));

		// Select is class in selenium which is used to handle dropdown
		// In select class there is constructor which take argument of webelement

		Select sel = new Select(country);

		List<WebElement> options = sel.getOptions();
		int count = 1;
		for (WebElement op : options) {
			System.out.println(count + "." + op.getText());
			count++;
		}

		System.out.println("After sorting ");
		TreeSet<String> set = new TreeSet<>();

		for (WebElement op : options) {
			set.add(op.getText());
		}

		// System.out.println(set);

		Iterator<String> itr = set.iterator();
		int ct = 1;
		while (itr.hasNext()) {

			System.out.println(ct + "." + itr.next());
			ct++;
		}

	}

}
