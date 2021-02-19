package VariousAnnotationsConcept;

import org.testng.annotations.*;

public class InvocationCountClass {
	
	int i;

	@Test(invocationCount=2,expectedExceptions=ArithmeticException.class)
	public void Invocationcountmethod()
	{
		System.out.println("Execute this method equal to Invocation count");
		i=10/0;
	}

}
