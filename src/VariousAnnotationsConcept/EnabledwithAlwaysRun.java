package VariousAnnotationsConcept;

import org.testng.annotations.Test;

public class EnabledwithAlwaysRun {
	
	@Test(dependsOnMethods="test2",alwaysRun=true)
	public void test1()
	{
		System.out.println("Print it in the console1");
		//Enabled Command is Dominating as This Method is not Running 
	}
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void test2()
	{
		System.out.println("Print it in the console2");
		//int i=1/0;
	}
}
