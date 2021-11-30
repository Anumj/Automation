package com.bookstore.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class captcha {

	public static void main(String[] args) {
		
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anupama.mj\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		        //ChromeOptions options = new ChromeOptions();
//		        options.addArguments("start-maximized");
//		        options.addArguments("disable-infobars");
//		        options.addArguments("--disable-extensions");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://demoqa.com/register");
		        //new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
		       // new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();
		    }
		

}
