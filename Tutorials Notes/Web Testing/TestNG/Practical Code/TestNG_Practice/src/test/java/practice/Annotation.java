package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	public String baseUrl = "https://www.browserstack.com/";
	public WebDriver driver ;
	
	@BeforeTest
	public void launchBrowser() {
	System.out.println("launching Chrome browser");
	driver = new ChromeDriver();
	driver.get(baseUrl);
	}
	@Test
	public void verifyHomepageTitle() {
	String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	}
	@AfterTest
	public void terminateBrowser(){
	driver.close();
	}
}