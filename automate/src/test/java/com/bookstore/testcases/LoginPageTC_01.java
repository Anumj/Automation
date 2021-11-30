package com.bookstore.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bookstore.pageobjects.bookloginPage;

public class LoginPageTC_01 extends BkBaseClass
{
	@Test
	public void loginTest() throws InterruptedException
	{
		 
		 driver.get(baseURL);
    	 log.info("URL is OPened");
		 
		 
		 bookloginPage lp=new bookloginPage(driver);
		 
		 
		 Thread.sleep(3000);
		 
//		   Actions act = new Actions(driver);
//           act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		 
		 
		
		    lp.setUsername(username);
			log.info("Entered UserName");
			
			lp.setPassword(password);
			log.info("Entered Password");
			
//			//Get handles of the windows
//	        String mainWindowHandle = driver.getWindowHandle();
//	        Set<String> allWindowHandles = driver.getWindowHandles();
//	        Iterator<String> iterator = allWindowHandles.iterator();
//
//	        // Here we will check if child window has other child windows and will fetch the heading of the child window
//	        while (iterator.hasNext()) {
//	            String ChildWindow = iterator.next();
//	                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
//	                driver.switchTo().window(ChildWindow);
//	                WebElement text = driver.findElement(By.xpath("//a[@id=\"close-fixedban\"]"));
//	                text.click();
//	                //System.out.println("Heading of child window is " + text.getText());
//	            }
			
			Thread.sleep(3000);
	        lp.Clicklogin();
			//lp.addnewuserbtn();
			Thread.sleep(3000);
			
		    System.out.println("title is :"	+driver.getTitle());
			if(driver.getTitle().equals("ToolsQA"))
			{
			
				Assert.assertTrue(true);
				log.info("LoginTest passed");
				Thread.sleep(3000);
			}
			else
			{
				
				//captureScreen( driver, "loginTest");
				Assert.assertTrue(false);
				log.info("LoginTest Failed");
			}
		}
		
	}
	

