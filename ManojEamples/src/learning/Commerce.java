package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commerce {

	public static void main(String[] args) {
		Commerce c=new Commerce();
		c.com();
		// TODO Auto-generated method stub

	}
public void com(){
	WebDriver driver=new FirefoxDriver();
	driver.get("http://demo.nopcommerce.com/");
	int rows=driver.findElements(By.xpath("//ul[@class='list']/ancestor:://ul[@class='list'/li]")).size();
	
}
}
