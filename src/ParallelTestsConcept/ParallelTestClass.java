package ParallelTestsConcept;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestClass {
	
	@Parameters("Browser")
	@Test
	public void Test(String Browser) throws InterruptedException
	{
		Date d= new Date();
		System.out.println(Browser+"----"+d);
		Thread.sleep(3000);
	}

}
