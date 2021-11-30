package com.bookstore.testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bookstore.pageobjects.AddToBookCollection;
import com.bookstore.pageobjects.BookSearch;
import com.bookstore.pageobjects.ProfilePage;
import com.bookstore.pageobjects.bookloginPage;

public class BookCollection extends BkBaseClass
{
	
	String alertText = "";
	@Test
	public void collection() throws InterruptedException
	{
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		bookloginPage lp1=new bookloginPage(driver);
		
		lp1.setUsername(username);
		lp1.setPassword(password);
		lp1.Clicklogin();
		
		
      ProfilePage pp1=new ProfilePage(driver);
		
		Actions act =new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(10000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(10000);
		pp1.clickBookstore();
		
		Thread.sleep(3000);
		
		BookSearch bs=new BookSearch(driver);
		bs.clickbooklist();
		
		AddToBookCollection ab=new AddToBookCollection(driver);
		
		//WebElement element = driver.findElement(By.id("addNewRecordButton"));
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		ab.clickaddToYourCollection();
		
		try {
		    WebDriverWait wait = new WebDriverWait(driver, 2);
		    wait.until(ExpectedConditions.alertIsPresent());
		    Alert alert = driver.switchTo().alert();
		    //System.out.println(alert.getText());
		    //alert.accept();
		    
		    String actual = alert.getText().toString();		    
		    String expected = "Book added to your collection.";
		    
		    System.out.println(" actual " + actual);
		    System.out.println(" expected " + expected);
		    System.out.println("Cond  " + actual.equalsIgnoreCase(expected));
		    
		    if (actual.equalsIgnoreCase(expected)) {
		    	System.out.println("Test Pass");
		    	alert.accept();
		    	Assert.assertTrue(alert.getText().contains("Book added to your collection"));
		    } 
		    else 
		    {
		    	System.out.println("Test Failed");
		    	//Assert.assertTrue(alert.getText().contains("Book added to your collection"));
		    	Assert.assertFalse(true);
		    }
		    
		    
		} catch (Exception e) {
		    //exception handling
			//System.out.println("mismatch");
		}
		
		Thread.sleep(1000);
		ab.clickBackToStore();
		
	
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		bs.clikonaddbook();
		Thread.sleep(1000);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		ab.clickaddToYourCollection();
		
		try {
		    WebDriverWait wait = new WebDriverWait(driver, 2);
		    wait.until(ExpectedConditions.alertIsPresent());
		    Alert alert = driver.switchTo().alert();
		    //System.out.println(alert.getText());
		    //alert.accept();
		    
		    String actual = alert.getText().toString();		    
		    String expected = "Book added to your collection.";
		    
		    System.out.println(" actual " + actual);
		    System.out.println(" expected " + expected);
		    System.out.println("Cond  " + actual.equalsIgnoreCase(expected));
		    
		    if (actual.equalsIgnoreCase(expected)) {
		    	System.out.println("Test Pass");
		    	alert.accept();
		    	Assert.assertTrue(alert.getText().contains("Book added to your collection"));
		    } 
		    else 
		    {
		    	System.out.println("Test Failed");
		    	//Assert.assertTrue(alert.getText().contains("Book added to your collection"));
		    	Assert.assertFalse(true);
		    }
		    
		    
		} catch (Exception e) {
		    //exception handling
			//System.out.println("mismatch");
			
			
		}
		
		Thread.sleep(1000);
		ab.clickBackToStore();
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@aria-label='rows per page']")));
		sel.selectByIndex(0);
		Thread.sleep(2000);
		bs.clickNextButton();
		Thread.sleep(2000);
		bs.clickPreviousButton();
		Thread.sleep(2000);
		bs.clicksearchbox();
		Thread.sleep(2000);
		
		bs.clicklogout();
		
		lp1.setUsername(username);
		lp1.setPassword(password);
		lp1.Clicklogin();
		Thread.sleep(1000);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
		pp1.clickDeleteAllBook();
		Thread.sleep(5000);
		
		//Handling alert boxes
		//Click on generate alert button
		//driver.findElement(By.cssSelector("div#AlertBox button")).click();
			
		//Thread.sleep(3000);
			
		//Using Alert class to first switch to or focus to the alert box
		//Alert alert = driver.switchTo().alert();
			
		//Using accept() method to accept the alert box
		//alert.accept();
			
		//Handling confirm box
		//Click on Generate Confirm Box
		driver.findElement(By.id("closeSmallModal-ok")).click();
			
		Thread.sleep(3000);
			
		Alert confirmBox = driver.switchTo().alert();
			
		//Using dismiss() command to dismiss the confirm box
		//Similarly accept can be used to accept the confirm box
		confirmBox.accept();
		Thread.sleep(1000);
		bs.clicklogout();
		  
	}
	
}
	

        
	

