package InheritanceConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass extends SuperClass {
	
	@BeforeSuite
	public void BeforeSuite6() {
		System.out.println("Before Suite-- Class6");
	}
	
	@BeforeTest
	public void BeforeTest6() {
		System.out.println("Before Test-- Class6");
	}
	
	@BeforeClass
	public void Beforeclass6() {
		System.out.println("Before class-- Class6");
	}
	
	@BeforeMethod
	public void BeforeClass6() {
		System.out.println("Before Method-- Class6");
	}

	@Test
	public void Test16()
	{
		System.out.println("Test 16-- Class6");
	}
	
	@Test
	public void Test26()
	{
		System.out.println("Test 26-- Class6");
	}
	

	@AfterMethod
	public void AfterMethod6()
	{
		System.out.println("After Method-- Class6");
	}
	
	@AfterTest
	public void Aftertest6()
	{
		System.out.println("After Test-- Class6");
	}
		
	@AfterClass
	public void AfterClass6()
	{
		System.out.println("After Class-- Class6");
	}
	}

