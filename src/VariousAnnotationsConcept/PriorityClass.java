package VariousAnnotationsConcept;

import org.testng.Assert;
import org.testng.annotations.*;

public class PriorityClass
{	
	//@Test(priority=0/10,dependsOnMethods="Test2") //Throw the Error due to Cyclic Dependencies
	@Test(priority=0/10)
	public void priorityTest()
	{
		System.out.println("Method with Highest Priority");
		Assert.assertTrue(false);
	}
	
	@Test(priority=12/6)
	public void priorityTest1()
	{
		System.out.println("Method with Second Highest Priority");
	}
	
	@Test(priority=10/10)
	public void priorityTest2()
	{
		System.out.println("Method with Third Highest Priority");
	}
}
//Throw the Error: Cyclic Dependencies
//@Test(dependsOnMethods="Test3")
//public void Test3()
//{
//	System.out.println("Method with forth Highest Priority");
//}
