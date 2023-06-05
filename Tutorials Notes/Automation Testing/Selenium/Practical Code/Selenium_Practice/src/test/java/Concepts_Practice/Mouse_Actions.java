package Concepts_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		//driver.get("https://www.orangehrm.com/");
		Thread.sleep(2000);
		Actions mouse = new Actions(driver);
		//mouse.moveToElement(driver.findElement(By.className("nav-link-hed"))).perform();
		//mouse.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/div/div/div/div/ul/li[1]"))).perform();
		//mouse.moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/div/div/div/div/ul/li[1]/div/div/h6[1]/a"))).click().perform();
		Thread.sleep(2000);
		//driver.findElement(By.id("myText")).sendKeys("parthasaradhi");
		//mouse.doubleClick(driver.findElement(By.id("myText"))).perform();
		driver.findElement(By.xpath("//span[.='right click me']"));
		mouse.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
		driver.findElement(By.xpath("//span[.='Copy']"));
		mouse.click(driver.findElement(By.xpath("//span[.='Copy']"))).perform();
	}
}