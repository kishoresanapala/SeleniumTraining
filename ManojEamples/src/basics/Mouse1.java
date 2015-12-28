package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1 {

	public static void main(String[] args) {
		Mouse1 m1=new Mouse1();
		m1.over();
		// TODO Auto-generated method stub

	}
	public void over(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.nopcommerce.com/");
		WebElement element=driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/electronics']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(element).build().perform();
		ac.contextClick(element).build().perform();
		ac.moveToElement(element).sendKeys(Keys.DOWN).build().perform();
	}

}
