package sahan;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Focus {

	public static void main(String[] args) {
		Focus f=new Focus();
		f.icici();
		// TODO Auto-generated method stub

	}
	public void icici(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.icicibank.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Private")));
		
		wait.until(ExpectedConditions.numberOfwindowsToBe(2));
		
		driver.findElement(By.linkText("Private")).click();
		Set<String> windows=driver.getWindowHandles();
		
		driver.switchTo().window(windows.toArray()[1].toString());
		boolean showing=driver.findElement(By.linkText("Our Commitment")).isDisplayed();
		System.out.println(showing);
		driver.quit();
	}

}
