package com.bookstore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookSearch 
{
	WebDriver driver;
	WebDriver localdriver;
	public BookSearch(WebDriver remotedriver)
	{
		localdriver=remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Git Pocket Guide')]")
	WebElement book1;
	
	@FindBy(xpath="//a[contains(text(),'Designing Evolvable Web APIs with ASP.NET')]")
	WebElement book2;
	
	@FindBy(xpath="//a[contains(text(),'Designing Evolvable Web APIs with ASP.NET')]")
	WebElement book3;

	
	@FindBy(xpath="//a[contains(text(),'Speaking JavaScript')]")
	WebElement book4;
	
	@FindBy(xpath="//a[contains(text(),'You Don't Know JS')]")
	WebElement book5;
	
	@FindBy(xpath="//a[contains(text(),'Programming JavaScript Applications')]")
	WebElement book6;
	
	@FindBy(xpath="//a[contains(text(),'Eloquent JavaScript, Second Edition')]")
	WebElement book7;
	
	@FindBy(xpath="//a[contains(text(),'Understanding ECMAScript 6')]")
	WebElement book8;
	
	@FindBy(id="see-book-Learning JavaScript Design Patterns")
	WebElement twobook;
	
	@FindBy(xpath="//button[contains(text(),'Log out')]")
	WebElement logout;
	
	@FindBy(id="searchBox")
	WebElement searchbox;
	
	@FindBy(xpath="//select[@aria-label='rows per page']")
	WebElement selectclass;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement NextButton;
	
	//@FindBy(xpath="//button[contains(text(),'Previous')]")
	@FindBy(xpath="//*[contains(text(),'Previous')]")
	WebElement PreviousButton;
	
	public void clickbooklist()
	{
		book1.click();
		
		//book5.click();
		
		
//		List<WebElement> elements = driver.findElements(By.cssSelector("#container_id > div"));
//		 for (WebElement element : elements) {
//		    System.out.println(element.getText());  	
		 
		
		
		/*boolean condition=true;
		while(condition)
		{
			java.util.List<WebElement> links = driver.findElements(By.xpath("//*[@class='rt-tbody']//span//a"));
		    for(int  i =0; i<=links.size(); i++) 
		    {
		    	System.out.println("The number of the links:"+links.size());
		    	// links.get(i).click();
		    	 links.get(i).getText();
		       
		    // and|or get text:       
		    
//		     if(false) {
//		           condition=false;
//		              }
		    }

		}*/
		
	}
		public void clikonaddbook()
		{
			twobook.click();
		}
	
		public void clicklogout()
		{
			logout.click();
		}
		public void clicksearchbox()
		{
			searchbox.sendKeys("You Don't Know JS");
		}
		public void clickNextButton()
		{
			NextButton.click();
		}
		public void clickPreviousButton()
		{
			PreviousButton.click();
		}
	
}
