package com.bookstore.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BkBaseClass 
{
	public String baseURL="https://demoqa.com/login";
	public String baseURL1="https://demoqa.com/register";
	public String username="anumj.07@gmail.com";
	public String password="Anupama1991*";
	
	public String Firstname="anu";
	public String Lastname="j";
	public String username1="cobab67709@ineedsa.com";
	public String password1="Anupama1991*";
	
	public static WebDriver driver;
	
	public static Logger log;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		//System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		//System.setProperty("Webdriver.chrome.driver","C:\\Users\\anupama.mj\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anupama.mj\\eclipse-workspace\\toolQA\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
 		//driver.get(baseURL);
		 log=Logger.getLogger("BookStore");
		 PropertyConfigurator.configure("log4j.properties");
		 
		 //driver.get(baseURL);
		 
//		 if(br.equals("chrome"))
//			{
//		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
//		driver=new ChromeDriver();	
//			}
//			else if(br.equals("firefox"))
//			{
//				System.setProperty("webdriver.gecko.driver", readconfig.getgeckoPath());
//				driver=new FirefoxDriver();
//			}
//			else if(br.equals("ie"))
//			{
//				System.setProperty("webdriver.ie.driver", readconfig.getiePath());
//				driver=new InternetExplorerDriver();
//			}
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
    }
}
