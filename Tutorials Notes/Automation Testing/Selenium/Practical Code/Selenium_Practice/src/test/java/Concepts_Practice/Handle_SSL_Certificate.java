package Concepts_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Handle_SSL_Certificate {
	public static void main(String[] args) {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		//---one way
		dc.setAcceptInsecureCerts(true);
		
		//---Another way
		//dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		//dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions options = new ChromeOptions();
		options.merge(dc);
		WebDriver driver1 = new ChromeDriver(options);
		driver1.get("https://expired.badssl.com/");
	}
}