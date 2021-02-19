package VariousAnnotationsConcept;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionClass {
	 
   //SoftAssert softAssert=new SoftAssert();
   String assertionString="demoforHardAssertion";
		  @Test(priority=0)
		  public void test1() 
		  {
			SoftAssert softAssert=new SoftAssert();
			softAssert.assertEquals("demoforHardAssertion2", assertionString);	 
			softAssert.assertAll();  
			System.out.println("should i print?");
		  }
			
		  @Test(priority=1)
		  public void test2() 
		  {
			SoftAssert softAssert=new SoftAssert();
			softAssert.assertEquals("demoforHardAssertion", assertionString);	  
			softAssert.assertAll();		
			System.out.println("i will be printing in the console");
		  }	  
	}

