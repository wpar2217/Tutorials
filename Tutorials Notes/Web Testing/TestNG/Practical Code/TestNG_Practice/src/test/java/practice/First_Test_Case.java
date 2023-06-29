package practice;

import org.testng.annotations.Test;

public class First_Test_Case {
	
	@Test(priority=1)
	public void test1() {
		System.out.println("Hello");
	}
	
	@Test(priority=2)
	public void test2() {
		System.out.println("World");
	}
}