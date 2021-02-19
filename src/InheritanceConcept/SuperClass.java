package InheritanceConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuperClass extends SuperiorClass {

	@BeforeSuite
	public void BeforeSuite4() {
		System.out.println("Before Suite-- Class4");
	}
	
	@BeforeTest
	public void BeforeTest4() {
		System.out.println("Before Test-- Class4");
	}
	
	@BeforeClass
	public void Beforeclass4() {
		System.out.println("Before class-- Class4");
	}
	
	@BeforeMethod
	public void BeforeClass4() {
		System.out.println("Before Method-- Class4");
	}

	@Test
	public void Test14()
	{
		System.out.println("Test 14-- Class4");
	}
	
	@Test
	public void Test24()
	{
		System.out.println("Test 24-- Class4");
	}
	

	@AfterMethod
	public void AfterMethod4()
	{
		System.out.println("After Method-- Class4");
	}
	
	@AfterTest
	public void Aftertest4()
	{
		System.out.println("After Test-- Class4");
	}
		
	@AfterClass
	public void AfterClass4()
	{
		System.out.println("After Class-- Class4");
	}
	}
