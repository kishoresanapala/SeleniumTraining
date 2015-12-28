package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {
		Xpath x=new Xpath();
		x.findElement();
		// TODO Auto-generated method stub

	}
	public void findElement(){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/intl/en/mail/help/about.html");
		// implict wait - 60 seconds
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("gmail-create-account")).click();
		driver.findElement(By.id("FirstName")).sendKeys("manojkumar");
		driver.findElement(By.id("LastName")).sendKeys("seepana");
		driver.findElement(By.id("GmailAddress")).sendKeys("seepana.manojkumar");
		driver.findElement(By.id("Passwd")).sendKeys("5678901234");
		driver.findElement(By.id("PasswdAgain")).sendKeys("5678901234");
		//driver.findElement(By.xpath("//input[@id='PasswdAgain']/ancestor::div[1]/following-sibling::div[1][@title='birthday']")
		driver.findElement(By.xpath("//div[@id=':d']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[text()='Male']")).click();
	}

}
