package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void gets(){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame("login_page");
	}

}
