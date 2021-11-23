package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * CssSelector is way to locate element using css properties
 * Two type of cssSelector 
 * 1.Absolute
 * 2.Dynamic/relative
 * 
 * 1.Absoulte cssSelector:From root node
 * html>body>center>form>div>table>tbody>tr>td>a
 * 
 * 2.Relative 
 * 1.Single/multiple: tagname[attribute='value'][attribute='value']
 * 2.Start-with:tagname[attribute^='value']
 * 3.end-with:tagname[attribute$='value']
 * 4.any/all:tagname[attribute*='value']
 * 5.id :#idvalue
 * 6.class: .classvalue
 * */
public class CssSelectorAllMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.cssSelector("input[name^='name']")).sendKeys("Selenium");
		
		driver.findElement(By.cssSelector("input[id$='no']")).sendKeys("908765431");
		driver.findElement(By.cssSelector("input[value='f']")).click();
		String text=driver.findElement(By.cssSelector(".f12")).getText();
	
		System.out.println(text);
		String code=driver.findElement(By.cssSelector("#lbl_txt")).getText();
		System.out.println(code);
		
		driver.findElement(By.cssSelector("input[name*='k_a']")).click();
	}

}
