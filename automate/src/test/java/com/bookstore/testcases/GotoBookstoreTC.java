package com.bookstore.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.bookstore.pageobjects.ProfilePage;
import com.bookstore.pageobjects.bookloginPage;

public class GotoBookstoreTC extends BkBaseClass
{

	@Test
	public void gotobookstore() throws InterruptedException
	{
		 driver.get(baseURL);
		
		bookloginPage bl=new bookloginPage(driver);
		bl.setUsername(username);
		bl.setPassword(password);
		bl.Clicklogin();

		
		ProfilePage pp=new ProfilePage(driver);
		
		Actions act =new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(20000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(20000);
		pp.clickBookstore();
		
		Thread.sleep(3000);
		
	}
}
