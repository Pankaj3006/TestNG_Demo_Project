package ParallelTestsConcept;

import java.util.Date;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelDataProvider {
	
	
	@Test(dataProvider="dp")
	public void Test(String Browser) throws InterruptedException
	{
		Date d= new Date();
		System.out.println(Browser+"----"+d);
		Thread.sleep(3000);
	}
	
	@DataProvider(name="dp",parallel=true)
	public Object[][] provideData()
	{
		Object[][] data = new Object[3][1];
		
		data[0][0] = "Firefox";
		data[1][0] = "Chrome";
		data[2][0] = "Internet Explorer";
		return data;
	}

}
