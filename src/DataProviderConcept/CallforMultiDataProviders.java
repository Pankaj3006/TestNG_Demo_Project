package DataProviderConcept;

import org.testng.annotations.Test;

public class CallforMultiDataProviders {
	
	@Test(dataProviderClass=Multiple_DataProviders.class,dataProvider="dp1")
	public void getData(String Username, String Passwd)
	{
		System.out.println(Username+"---"+Passwd);
	}

	
	@Test(dataProviderClass=Multiple_DataProviders.class,dataProvider="dp1")
	public void getData1(String Username, String Passwd, String Age)
	{
		System.out.println(Username+"---"+Passwd+"---"+Age);
		
	}

}

