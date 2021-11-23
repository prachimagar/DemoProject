package demotestng;

import org.testng.annotations.Test;
/*
 * If same annotation are the sequnce of execution is Alpha numeric way method name which Upper case has 
 * first preference over lower case 
 * 
 * */
public class Sequences {
  @Test
  public void A_1() {
	  System.out.println("A_1");
  }
  @Test
  public void a_1() {
	  System.out.println("a_1");
  }
  @Test
  public void B_1() {
	  System.out.println("B_1");
  }
  @Test
  public void A_2() {
	  System.out.println("A_2");
  }
}
