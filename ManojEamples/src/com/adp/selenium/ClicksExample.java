package com.adp.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClicksExample {
	WebDriver driver;

	public static void main(String[] args) {
		ClicksExample ob= new ClicksExample();
		ob.openApplication();
		
	}

	public void openApplication() {
		driver = new FirefoxDriver(); // opens browser
		driver.get("http://demo.nopcommerce.com/"); // hit URL
		//driver.findElement(By.linkText("Register")).click(); // clicking on register link - Method1
		//driver.findElement(By.linkText("Register")).sendKeys(Keys.ENTER); // clicking on register link - Method2
		
		//Actions subash= new Actions(driver); - Method3
		//subash.click(driver.findElement(By.linkText("Register"))).build().perform();
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.linkText("Register"))); - Method4
	}

	public void lastName(){
		
		 
		//clickElement(By.linkText("Register"));
		
	}
	
	public void clickElement(By by){
		driver.findElement(by).click();
	}
	
	
}
