package demotestng;

/*
 * 
 * Running  from @BeforeSuite
Running  from @BeforeTest
Running  from @BeforeClass
Running  from @BeforeMethod
Running  from @Test
Running  from @AfterMethod
Running  from @AfterClass
Running  from @AfterTest
Running  from @AfterSuite
*/

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnnotations {
  @Test
  public void f() {
	  System.out.println("Running  from @Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Running  from @BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Running  from @AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Running  from @BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Running  from @AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Running  from @BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Running  from @AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Running  from @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Running  from @AfterSuite");
  }

}
