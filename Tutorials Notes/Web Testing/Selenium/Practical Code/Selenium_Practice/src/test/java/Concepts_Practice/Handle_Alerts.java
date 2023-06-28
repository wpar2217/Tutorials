package Concepts_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", ""); //TO scroll window
		Thread.sleep(2000);
		
		//Simple Alert
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000); Alert sample = driver.switchTo().alert();
		sample.accept();
		Thread.sleep(2000);
		 
		//Confirmation Alert
		//---To Accept
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(2000);
		Alert sample1 = driver.switchTo().alert();
		sample1.accept();
		Thread.sleep(2000);
		 
		
		//---TO dismiss
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(2000);
		Alert sample2 = driver.switchTo().alert();
		sample2.dismiss();
		Thread.sleep(2000);
		 
		
		//Prompt Alert
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(2000);
		Alert sample3 = driver.switchTo().alert();
		sample3.sendKeys("Partha Saradhi Reddy");
		Thread.sleep(2000);
		sample3.accept();
		Thread.sleep(2000);
	}
}