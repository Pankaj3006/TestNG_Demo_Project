package InheritanceConcept;

import org.testng.annotations.*;

public class SuperiorClass {
	
	@BeforeSuite
	public void BeforeSuite1() {
		System.out.println("Before Suite-- Class1");
	}
	
	@BeforeTest
	public void BeforeTest1() {
		System.out.println("Before Test-- Class1");
	}
	
	@BeforeClass
	public void Beforeclass1() {
		System.out.println("Before class-- Class1");
	}
	
    @BeforeMethod
	public void BeforeClass() {
		System.out.println("Before Method-- Class1");
	}

	@Test
	public void Test11()
	{
		System.out.println("Test11-- Class1");
	}
	
	@Test
	public void Test21()
	{
		System.out.println("Test21-- Class1");
	}
	

	@AfterMethod
	public void AfterMethod1()
	{
		System.out.println("After Method-- Class1");
	}
	
	@AfterTest
	public void Aftertest1()
	{
		System.out.println("After Test-- Class1");
	}
		
	@AfterClass
	public void AfterClass1()
	{
		System.out.println("After Class-- Class1");
	}
	}

