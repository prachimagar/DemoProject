package demotestng;

import org.testng.annotations.Test;

public class FirstTest {

	public static void main(String[] args) {
		System.out.println("Running from java");

	}
	
	@Test
	public void test() {
		System.out.println("Running from testng");
	}

}
