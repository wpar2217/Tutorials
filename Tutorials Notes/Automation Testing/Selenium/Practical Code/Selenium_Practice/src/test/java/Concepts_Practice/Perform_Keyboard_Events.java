package Concepts_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform_Keyboard_Events {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://extendsclass.com/text-compare.html");
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[7]/pre/span"));
		Thread.sleep(2000);
		Actions action1 = new Actions(driver);
		action1.keyDown(element1, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[10]/pre"));
		Thread.sleep(2000);
		Actions action2 = new Actions(driver);
		action2.keyDown(element2, Keys.CONTROL).sendKeys("v").build().perform();
	}
}