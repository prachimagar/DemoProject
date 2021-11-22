package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	WebDriver driver;
	@FindBy(id="login1")
	WebElement userbox;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement passbox;
	
	
	@FindBy(name="proceed")
	WebElement loginbtn;
	
	@FindBy(tagName="a")
	List<WebElement> link;
	
	
	public LoginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void doLoginAs(String user,String pass) {
		userbox.sendKeys(user);
		passbox.sendKeys(pass);
		loginbtn.click();
	}

}
