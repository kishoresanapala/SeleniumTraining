package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverExamplew {
	//WebDriver driver;

	public static void main(String[] args) {
		MouseOverExamplew ow = new MouseOverExamplew();
		ow.result();
		// TODO Auto-generated method stub

	}

	public void result() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.nopcommerce.com/");
		WebElement computersLink=driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/computers']"));
		Actions act= new Actions(driver);
		act.moveToElement(computersLink).build().perform(); //move to element
		
		act.contextClick(computersLink).build().perform(); //right click on an element
		
		act.moveToElement(computersLink).sendKeys(Keys.DOWN).build().perform(); // 

	}

}
