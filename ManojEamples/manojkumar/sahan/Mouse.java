package sahan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		Mouse m=new Mouse();
		m.mouseOver();
				
		// TODO Auto-generated method stub

	}
	public void mouseOver(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.nopcommerce.com/");
		//driver.findElement(By.linkText("Computers")).click();
		WebElement web=driver.findElement(By.xpath("//ul[@class='top-menu'] //a[@href='/computers']"));
		Actions acti=new Actions(driver);
		acti.moveToElement(web).build().perform();
		acti.contextClick(web).build().perform();
		acti.moveToElement(web).sendKeys(Keys.DOWN).build().perform();
	}

}
