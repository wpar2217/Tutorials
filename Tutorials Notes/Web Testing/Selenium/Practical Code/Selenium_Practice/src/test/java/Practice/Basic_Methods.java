package Practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
		
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements);
		
		driver.navigate().to("https://www.sugarcrm.com/");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/section[4]/div/div/div[1]/a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		 
		driver.close();
	}
}