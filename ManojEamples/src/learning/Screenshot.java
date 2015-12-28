package learning;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Screenshot s=new Screenshot();
		s.screenCapture();

	}
	
	public void screenCapture() throws IOException {
		driver=new FirefoxDriver();
		driver.get("http://www.icicibank.com/");
	
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("D:\\abc.jpg"));
	}

}
