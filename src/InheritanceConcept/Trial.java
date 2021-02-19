package InheritanceConcept;

import org.testng.annotations.Test;
import DataProviderConcept.DataProviderClass;

public class Trial extends DataProviderClass {
	
	@Test(dataProvider="provideData")
	public void test(String username, String Pswd)
	{
		System.out.println("Main Method");
		System.out.println(username);
		System.out.println(Pswd);
	}
	
}
 