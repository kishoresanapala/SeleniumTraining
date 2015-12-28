package learning;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class NextPage {

	public static void main(String[] args) {
		NextPage np=new NextPage();
		np.show();
		// TODO Auto-generated method stub

	}
	public void show(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.icicibank.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[@class='siteCaptureContent']/div)[2]/div[1]")).click();
		
		
		
		
		driver.findElement(By.linkText("Private")).click();
		Set<String> w=driver.getWindowHandles();
		driver.switchTo().window(w.toArray()[1].toString());
		driver.findElement(By.linkText("Our Commitment")).click();
		driver.close();
		driver.switchTo().window(w.toArray()[0].toString());
		
		driver.findElement(By.linkText("Products")).click();
	}
	

}
