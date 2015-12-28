package com.adp.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TableHandling {
	WebDriver driver;

	public static void main(String[] args) {
		TableHandling ob = new TableHandling();
		ob.openApplication();

	}

	public void openApplication() {
		driver = new FirefoxDriver(); // opens browser
		driver.get("file:///E:/JarFiles/TestFile.html"); // hit URL

		int rows = driver.findElements(By.xpath("//table[@id='transactions']/tbody[2]/tr")).size();

		for (int i = 1; i <= rows; i++) {
			String idValue = driver.findElement(By.xpath("//table[@id='transactions']/tbody[2]/tr[" + i + "]/td[1]")).getText();
			if (idValue.equals("103"))
				driver.findElement(By.xpath("//table[@id='transactions']/tbody[2]/tr[" + i + "]/td[4]/input")).click();
		}

	}

	public void lastName() {

		// clickElement(By.linkText("Register"));

	}

	public void clickElement(By by) {
		driver.findElement(by).click();
	}

}
