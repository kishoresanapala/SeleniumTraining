package learning;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowsExample {

	public static void main(String[] args) throws IOException {
		MultipleWindowsExample x = new MultipleWindowsExample();
		x.findElement();
		// TODO Auto-generated method stub

	}

	public void findElement() throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.icicibank.com/");
		// implict wait - 60 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//
		File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File("E:\\JarFiles\\Screnshot1.png"));
		
		
		//wait until Private link to be clickable
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Private")));

 		driver.findElement(By.linkText("Private")).click();
 		
 		//wait until two windows are displayed
		wait.until(ExpectedConditions.numberOfwindowsToBe(2));
 		
 		Set<String> windows=driver.getWindowHandles();
 		for(String win:windows)
 			System.out.println(win);
 		
 		driver.switchTo().window(windows.toArray()[1].toString());
		
		boolean linkIsDisplayed=driver.findElement(By.linkText("Our Commitment")).isDisplayed();
		System.out.println(linkIsDisplayed);
		
		//driver.switchTo().window(windows.toArray()[0].toString());
		//driver.close();
		driver.quit();
		
	}

}
