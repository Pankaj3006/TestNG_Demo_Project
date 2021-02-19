package VariousAnnotationsConcept;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoftAssertionClass {

	String assertionString="demoforHardAssertion";
	@Test(dependsOnMethods="test2")
	public void test1() 
	{
		SoftAssert sa =  new SoftAssert();
		sa.assertEquals("demoforHardAssertion", assertionString);
		System.out.println("After Assert equals1");
		sa.assertTrue(assertionString.equals("demoforHardAssertion"));
		System.out.println("After Assert true1");  
		sa.assertAll();
	}

	@Test
	public void test2() 
	{
	Assert.assertEquals("demoforHardAssertion", assertionString);
	System.out.println("After Assert equals2");
	Assert.assertTrue(assertionString.equals("demoforHardAssertion"));
	System.out.println("After Assert true2");
	}
}
