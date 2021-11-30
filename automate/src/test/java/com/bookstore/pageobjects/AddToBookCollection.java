package com.bookstore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToBookCollection 
{
	WebDriver ldriver;
	public AddToBookCollection(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//button[contains(text(),'Add To Your Collection')]")
	WebElement addtoyourcolllection;
	
	@FindBy(xpath="//button[contains(text(),'Back To Book Store')]")
	WebElement backtostore;
	
	public void clickaddToYourCollection()
	{
		addtoyourcolllection.click();
	}
	
	public void clickBackToStore()
	{
		backtostore.click();
	}
}
