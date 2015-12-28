package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) {
		Click c=new Click();
		c.differentWays();
		// TODO Auto-generated method stub

	}
public void differentWays(){
	WebDriver driver=new FirefoxDriver();
	driver.get("http://demo.nopcommerce.com/");
//driver.findElement(By.linkText("Register")).click();//method-1
//driver.findElement(By.linkText("Register")).sendKeys(Keys.ENTER);//method-2
    Actions act=new Actions(driver);
    act.click(driver.findElement(By.linkText("Register"))).build().perform();

}
}
