package Concepts_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform_RightCLick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.tcsion.com/dotcom/TCSSMB/Login/login.html");
		Thread.sleep(2000);
		WebElement element =  driver.findElement(By.name("accountname"));
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}
}