package VariousAnnotationsConcept;

import org.testng.SkipException;
import org.testng.annotations.*;
public class SkippingAnnotation {
	
	@Test
	public void SkipTest()
	{
		System.out.println("Skip this test");
		throw new SkipException("We want to Skip this test");
	}

}
