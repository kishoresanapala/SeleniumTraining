package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Open {

	public static void main(String[] args) {
		Open o=new Open();
		o.browser();
		// TODO Auto-generated method stub

	}
	public void browser(){
		
			// TODO: handle exception
		
		WebDriver wb=new FirefoxDriver();
		wb.get(" http://demo.nopcommerce.com/");
		wb.findElement(By.linkText("Register")).click();
		//wb.findElement(By.linkText("login")).click();
		wb.findElement(By.id("gender-male")).click();
		wb.findElement(By.id("FirstName")).sendKeys("manojkumar");
		wb.findElement(By.id("LastName")).sendKeys("seepana");
		WebElement selectDay=wb.findElement(By.name("DateOfBirthDay"));
		Select s=new Select(selectDay);
		s.selectByValue("15");
		WebElement selectMonth=wb.findElement(By.name("DateOfBirthMonth"));
		Select s1=new Select(selectMonth);
		s1.selectByValue("12");
		WebElement selectYear=wb.findElement(By.name("DateOfBirthYear"));
		Select s2=new Select(selectYear);
		s2.selectByValue("2011");
		wb.findElement(By.id("Email")).sendKeys("seepana.manojkumar@gmail.com");
		wb.findElement(By.id("Company")).sendKeys("tcs");
		wb.findElement(By.id("Newsletter")).click();
		wb.findElement(By.id("Password")).sendKeys("0987654321");
		wb.findElement(By.id("ConfirmPassword")).sendKeys("0987654321");
		wb.findElement(By.id("register-button")).click();
	
	}
}
