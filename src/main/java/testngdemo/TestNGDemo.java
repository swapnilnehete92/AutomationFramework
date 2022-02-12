package testngdemo;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("I am BEFORE Suite");

	}

	@BeforeTest
	public void test() {
		System.out.println("I am TEST");

	}

	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("I am BEFORE Class");

	}

	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		System.out.println("I am BEFORE Method");

	}

	@Test
	public void testCase1() {
		System.out.println("I am Test Case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("I am Test Case 2");
	}

	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("I am AFTER Method");
	}

	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("I am AFTER Class");

	}

	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("I am AFTER Test");

	}

	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		System.out.println("I am AFTER Suite");

	}
}
