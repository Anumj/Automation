package com.bookstore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage 
{
WebDriver localdriver;
	
	public ProfilePage(WebDriver remotedriver)
	{
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
		
	}
	
	@FindBy(id="gotoStore")
	WebElement gotobk_store;
	
	@FindBy(id="searchBox")
	WebElement searchbox;
	
	@FindBy(xpath="//button[contains(text(),'Log out')]")
	WebElement logout;
	
	@FindBy(xpath="//button[contains(text(),'Previous')]")
	WebElement previous;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement next;
	
	@FindBy(xpath="//span[@class='select-wrap -pageSizeOptions']")
	WebElement selectoptions;
	
	@FindBy(xpath="//button[contains(text(), OR 'Delete Account')]")
	WebElement DeleteAccount;
	
	@FindBy(xpath="//div[@class='text-right button di']//button[@id='submit']")
	WebElement DeleteAllBook;
	
	@FindBy(xpath="//div[@class='main-header']")
	WebElement header;
	
	public void clickBookstore()
	{
		gotobk_store.click();
	}
	public void clickDeleteAllBook() 
	{
		DeleteAllBook.click();
	}
}
