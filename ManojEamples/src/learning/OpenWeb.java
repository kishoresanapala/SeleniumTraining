package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenWeb {
	//WebDriver driver;

	public static void main(String[] args) {
		OpenWeb ow = new OpenWeb();
		ow.result();
		// TODO Auto-generated method stub

	}

	public void result() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.nopcommerce.com/");
		driver.findElement(By.linkText("register")).click();

	}

}
