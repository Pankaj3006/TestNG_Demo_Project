package ScreenShotConcept;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenshotClass {
	
	public static WebDriver driver;
	
	public static void DriverInitializer()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void FailedTestcase(String result) throws IOException
	{
	File Srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Srcfile, new File("E:\\DRIVER\\TestNG_Demo_Project\\ScreenShot\\"+result+"screenshot.png"));
	}
	
	

}
