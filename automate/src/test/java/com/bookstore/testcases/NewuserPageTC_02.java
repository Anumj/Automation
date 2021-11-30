//package com.bookstore.testcases;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
//
//import com.bookstore.pageobjects.AddnewUser;
//
//public class NewuserPageTC_02 extends BkBaseClass
//{
//	@Test
//	public void adduser() throws InterruptedException
//	{
//		driver.get(baseURL1);
//   	 log.info("URL is OPened");
//   	 
//   	AddnewUser newuser=new AddnewUser(driver);
//   	Thread.sleep(2000);
//
//   	newuser.firstname(Firstname);
//   	
//   	Thread.sleep(2000);
//   	newuser.lastName(Lastname);
//   	Thread.sleep(2000);
//
//	newuser.userName(username1);
//	Thread.sleep(2000);
//	
//	newuser.password(password1);
//	Thread.sleep(2000);
//	
//	newuser.register();
//	Thread.sleep(2000);
//	
//	}
//	
//	
//}
//
