package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameExample {

	public static void main(String[] args) {
		FrameExample x=new FrameExample();
		x.findElement();
		// TODO Auto-generated method stub

	}
	public void findElement(){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		// implict wait - 60 seconds
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//to get control in framw
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.xpath("//input[@class='input_password']")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//input[@class='input_password']")).clear();
		
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		
		//Handling javascript popup
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
		// getting out from frame
		driver.switchTo().defaultContent();
	}

}
