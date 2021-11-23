package demotestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
  @Test()
  public void a() {
	  Assert.assertEquals(true, false);
  }
  @Test(dependsOnMethods="a")
  public void b() {
  }
  @Test(dependsOnMethods="a")
  public void c() {
  }
  
}
