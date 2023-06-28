package Concepts_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Frames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", ""); //TO scroll window
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Text1"); //Main document
		Thread.sleep(2000);
		driver.switchTo().frame("frm1"); //frame1
		Select courseName_dd = new Select(driver.findElement(By.id("course")));
		courseName_dd.selectByVisibleText("Java");
		driver.switchTo().defaultContent(); //Main document
		driver.switchTo().frame("frm2"); //frame2
		driver.findElement(By.id("firstName")).sendKeys("Partha Saradhi");
		driver.switchTo().defaultContent(); //Main document
		driver.switchTo().frame("frm1"); //frame1
		courseName_dd.selectByVisibleText("Dot Net");
		driver.switchTo().defaultContent(); //Main document
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Text2");
		Thread.sleep(2000);
	}
}