package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Xpath stands for xtensible markup language path 
 * xpath helps to  track the element using attribute and tag
 * There two type 
 * 1.Absoulte
 * 2.Relative/Dynamic xpath 
 * 
 * 1.Asoulte:It start from root node i.e html it will traverse down till element is locate
 * start single slash /
 * not safe strategy to locate element as developer might change few attribute or tag in future
 * /html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[1]/div[2]/input
 * 
 * 
 *  2.Relative:It start from middle of dom(document object model)
 *  start with double slash //
 *  //tagName[@attribute='value']
 *   //*[@attribute='value']
 * //input[@id='login1']
 * */
public class Checkbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		driver.findElement(By.xpath("//input[@name='option1']")).click();
		
		
		
	}

}
