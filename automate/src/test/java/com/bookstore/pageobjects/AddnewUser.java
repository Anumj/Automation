//package com.bookstore.pageobjects;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class AddnewUser 
//{
//	
//	
// WebDriver rdriver;
// public AddnewUser(WebDriver ldriver)
// {
//	 ldriver=rdriver;
//	 PageFactory.initElements(rdriver, this );
// }
// 
// @FindBy(id="newUser")
// WebElement newuserbtn;
// 
// @FindBy(id="firstname")
// WebElement firstname;
// 
// @FindBy(id="lastname")
// WebElement lastname;
// 
// @FindBy(id="userName")
// WebElement adduser_Username;
// 
// @FindBy(id="password")
// WebElement adduser_Pwd;
// 
// 
// //SITE KEY=6LcGyUAdAAAAAFDTTea5vZfLXm4-yqKYrHEUDAXw;
// //SECRET KEY=6LcGyUAdAAAAACWU2hUSWOQW-dVKzboOuUGpQOqc;
// 
// 
////span[@id="recaptcha-anchor"]
// 
// @FindBy(id="register")
// WebElement Register;
// 
// @FindBy(xpath="//*[contains(text(),'Back to Login')]")
// WebElement backlogin;
// 
// 
// public void firstname(String Firstname)
// {
//	 firstname.sendKeys(Firstname);
// }
// public void lastName(String Lastname)
// {
//	 lastname.sendKeys(Lastname);
// }
// public  void userName(String username1)
// {
//	 adduser_Username.sendKeys(username1);
// }
// public void password(String password1)
// {
//	 adduser_Pwd.sendKeys(password1);
// }
// public void register()
// {
//	 Register.click();
// }
// public void backtologin()
// {
//	 backlogin.click();
// }
// public void clicknewuser()
// {
//	 newuserbtn.click();
// }
// 
//}
