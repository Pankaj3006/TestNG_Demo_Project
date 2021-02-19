package DataProviderConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_UsingExcel {
	
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
		System.out.println(UserName+"------"+Password);
	}

	@DataProvider()
	public Object[][] getData() throws IOException 
	{
		FileInputStream fis= new FileInputStream("E:\\DRIVER\\Excel_Demo.xlsx"); 
		XSSFWorkbook excel = new XSSFWorkbook(fis);
		XSSFSheet sheet = null;
		int rowcount = 0;
		int colcount = 0;
		for(int i=0; i<excel.getNumberOfSheets(); i++)
		{
			if(excel.getSheetName(i).equalsIgnoreCase("Office"))
			{
				sheet= excel.getSheetAt(i);
				rowcount = sheet.getLastRowNum();
				colcount = sheet.getRow(i).getLastCellNum();
			}
		}
		System.out.println(rowcount);
		System.out.println(colcount);
		Object[][] data = new Object[rowcount][colcount];
		for(int j=1; j<=rowcount; j++)
		{
			XSSFRow currentrow = sheet.getRow(j);
			for(int k=0; k<colcount; k++)
			{
				data[j-1][k] =	currentrow.getCell(k).toString();
			}
			
		}
		excel.close();	
		return data;		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
