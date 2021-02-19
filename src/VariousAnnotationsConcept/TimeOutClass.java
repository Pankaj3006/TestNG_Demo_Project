package VariousAnnotationsConcept;

import org.testng.annotations.Test;

public class TimeOutClass {

	@Test(timeOut=1)//1 ms
	public void bike() {
		int i=1;
		while(i==1)
		{
	        System.out.println("It will enter infinite loop but will get Stop after Specified Time automatically");
		}
	}
	
	
	
	
	

}
