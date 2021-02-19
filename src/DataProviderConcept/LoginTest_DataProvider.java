package DataProviderConcept;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest_DataProvider {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
	}
	
	@Test(dataProvider="getData")
	public void loginTest(String UserName, String Password)
	{
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		driver.findElement(By.cssSelector("input[id='Login']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.print(driver.findElement(By.xpath("//div[@id='error']")).getText());
		System.out.println("For: "+ UserName+" | "+Password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[5][2];
		
		data[0][0]="Pankaj Gupta1";
		data[0][1]="Pankaj30061";
		
		data[1][0]="Pankaj Gupta2";
		data[1][1]="Pankaj30062";
		
		data[2][0]="Pankaj Gupta3";
		data[2][1]="Pankaj30063";
		
		data[3][0]="Pankaj Gupta4";
		data[3][1]="Pankaj30064";
		
		data[4][0]="Pankaj Gupta5";
		data[4][1]="Pankaj30065";
		return data;
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
