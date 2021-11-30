package com.bookstore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookloginPage 
{
	WebDriver localdriver;
	
	public bookloginPage(WebDriver remotedriver)
	{
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
		
	}
	
	@FindBy(id="userName")
	WebElement txtuserName;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	//@FindBy(id="login")
	WebElement loginbtn;
	
	 @FindBy(id="newUser")
		WebElement addnewuser;
	
	
	
	public void setUsername(String Uname) 
	{
		txtuserName.sendKeys(Uname);
	}
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	public void Clicklogin()
	{
		
		loginbtn.click();
		
	}
//	public void addnewuserbtn() {
//		addnewuser.click();
//		
//		
//	}


}
