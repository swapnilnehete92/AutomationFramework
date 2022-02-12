package testngdemo;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("I am BEFORE Suite of Demo 2");

	}

	@BeforeTest
	public void test() {
		System.out.println("I am TEST of Demo 2");

	}

	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("I am BEFORE Class of Demo 2");

	}

	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		System.out.println("I am BEFORE Method of Demo 2");

	}

	@Test
	public void testCase3() {
		System.out.println("I am Test Case 3 of Demo 2");
	}

	@Test
	public void testCase4() {
		System.out.println("I am Test Case 4 of Demo 2");
	}

	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("I am AFTER Method of Demo 2");
	}

	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("I am AFTER Class of Demo 2");

	}

	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("I am AFTER Test of Demo 2");

	}

	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		System.out.println("I am AFTER Suite of Demo 2");

	}

}
