package tddTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import tdd.PasswordBox;

public class NewTest {
	PasswordBox pb;
	@Test
	public void test1() {

		PasswordBox pb = new PasswordBox();
		System.out.println(pb.isPasswordValid("ascdf"));

	}

	@Test
	public void test2() {

		String str="ascdfg1";
		
		if(!str.matches("0-9")) {
			System.out.println(false);
		}
		//System.out.println(pb.isPasswordValid("ascdf g"));

	}

	@Test
	public void test3() {

		System.out.println(pb.isPasswordValid("ascdfgascdfgascdfg"));

	}

	@Test
	public void test4() {
		
		

		System.out.println(pb.isPasswordValid("ascdfgascdfgascdfgh"));

	}
	
	@Test
	public void test5() {
		
		

		System.out.println("Running from test5"+":"+pb.isPasswordValid("aa1aaa"));

	}
	

	@BeforeTest
	public void bft() {

		 pb = new PasswordBox();
	}

}
