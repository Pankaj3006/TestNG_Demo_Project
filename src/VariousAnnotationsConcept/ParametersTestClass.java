package VariousAnnotationsConcept;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestClass 
{	
	WebDriver driver;
	
	@BeforeMethod
	//@Test
	@Parameters({"Browser"})
	public void launchBrowser(String Browser)
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		else
		{
		System.setProperty("webdriver.gecko.driver", "E:\\DRIVER\\Drivers\\Firefox Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();	
		}
	}
	
	@Test
	//@Test(dependsOnMethods="launchBrowser")
	@Parameters({"URL","UserName","Password"})
	public void login(String URL, String UserName, String Password)
	{
		driver.get(URL);
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		driver.findElement(By.cssSelector("input[id='Login']")).click();	
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());
	}
	
	@AfterMethod
	//@Test(dependsOnMethods="login")
	public void teardown()
	{
		driver.close();
	}
}
