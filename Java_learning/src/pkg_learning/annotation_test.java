package pkg_learning;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation_test {
	@Test(priority=2)
	public void test1() {
		System.out.println("Test1");
	}
	@Test(priority=3)
	public void test2() {
		System.out.println("Test2");
	}
	@Test(priority=1)
	public void test3() {
		System.out.println("Test3");
	}
	
	@BeforeClass
	public void b4Class() {
		System.out.println("Before Class");
	}
	@BeforeSuite
	public void b4Suite() {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void b4Test() {
		System.out.println("Before Test");
	}

	@BeforeMethod
	public void b4method() {
		System.out.println("Before Method");
	}
	@AfterClass
	public void a4Class() {
		System.out.println("After Class");
	}
	@AfterSuite
	public void a4Suite() {
		System.out.println("After Suite");
	}
	@AfterTest
	public void a4Test() {
		System.out.println("After Test");
	}

	@AfterMethod
	public void a4method() {
		System.out.println("After Method");
	}
}
