package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Internet {

	public static void main(String[] args) {
		Internet i=new Internet();
		i.explorar();
		
		// TODO Auto-generated method stub

	}
public void explorar(){
	System.setProperty("webdriver.ie.driver", "E:\\JarFiles\\IEDriverServer.exe");
	DesiredCapabilities capbility=DesiredCapabilities.internetExplorer();
    capbility.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	capbility.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
	WebDriver driver=new InternetExplorerDriver(capbility);
	driver.get("https://www.google.com");
}
}
