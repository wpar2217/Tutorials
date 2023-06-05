package Concepts_Practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hanlde_Multiple_Windows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)", ""); //TO scroll window
		Thread.sleep(2000);
		String ParentHandle = driver.getWindowHandle();//before entering the new window,
		//I'am storing the current window handle
		System.out.println("Parent window---" + ParentHandle);
		Thread.sleep(2000);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> Handles = driver.getWindowHandles();
		for (String handle : Handles) {
			System.out.println(handle);
			if(!handle.equals(ParentHandle)) {
				driver.switchTo().window(handle);
			    driver.findElement(By.id("firstName")).sendKeys("Parthasaradhi");
			    Thread.sleep(5000);
			    driver.close();
			}
		}
		driver.switchTo().window(ParentHandle);
		driver.findElement(By.id("name")).sendKeys("Reddy");
		Thread.sleep(2000);
	}
}