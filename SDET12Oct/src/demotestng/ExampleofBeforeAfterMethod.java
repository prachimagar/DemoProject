package demotestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class ExampleofBeforeAfterMethod {
  @Test
  public void az_1() {
	  System.out.println("After login search product and buy");
  }
  @Test
  public void az_2() {
	  System.out.println("After login search product ad to cart logout");
	  
  }
  @Test
  public void az_3() {
	  System.out.println("After login remove product from cart logout");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Login");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("close browser");
  }

}
