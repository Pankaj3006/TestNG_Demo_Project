package DataProviderConcept;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Execute every time before method");
	}
	
	@Test(dataProvider="provideData")
	public void test(String username, String Pswd)
	{
		System.out.println("Main Method");
		System.out.println(username);
		System.out.println(Pswd);
	}

	@DataProvider
	public Object[][] provideData()
	{
		Object[][] data = new Object[3][2]; 
		
		data[0][0] = "pankajkit";
		data[0][1] = "12345678";
		
		data[1][0] = "pankajinfy";
		data[1][1] = "30061989";
		
		data[2][0] = "pankajbhu";
		data[2][1] = "19893006";
		
		return data;
	}
	
}