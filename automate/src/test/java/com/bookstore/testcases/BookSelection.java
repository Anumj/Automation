package com.bookstore.testcases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.bookstore.pageobjects.BookSearch;
import com.bookstore.pageobjects.ProfilePage;
import com.bookstore.pageobjects.bookloginPage;

public class BookSelection  extends BkBaseClass
{

	
	@Test
	public void bookselect() throws InterruptedException
	{
		
		driver.get(baseURL);
		
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
		
//		java.util.List<WebElement> Alllinks = driver.findElements(By.xpath("//*[@class='rt-tbody']//span//a"));
//
//		 // Iterate the Array List
//		 Iterator iterate = Alllinks.iterator();
//
//		 while (iterate.hasNext()) {
//		 // Print the URL
//		 url = iterate.next().getAttribute("href");
//		 System.out.println(url);
//		
//		
//	}
		
		
		
	
	}
}
