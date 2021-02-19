package ScreenShotConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WrittenTestClass extends ScreenshotClass {
	
	@BeforeMethod
	public void launchBrowser()
	{
		DriverInitializer();
	}
	
	@Test
	public void GoogleTest()
	{
		driver.get("https://www.google.com");
		Assert.assertEquals(false, true);
	}

	@Test
	public void CricbuzzTest()
	{
		driver.get("https://www.cricbuzz.com");
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void FacebookTest()
	{
		driver.get("https://www.facebook.com");
		Assert.assertEquals(false, true);	
	}
	
	@Test
	public void LoginSalesTest()
	{
		driver.get("https://login.salesforce.com");
		Assert.assertEquals(false, true);	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
