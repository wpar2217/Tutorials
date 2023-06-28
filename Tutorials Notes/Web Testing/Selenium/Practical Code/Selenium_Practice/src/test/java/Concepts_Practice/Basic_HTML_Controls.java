package Concepts_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_HTML_Controls {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", ""); //TO scroll window
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Guduru");
		Thread.sleep(2000);
		driver.findElement(By.name("lName")).sendKeys("Rajasekhar Reddy");
		Thread.sleep(2000);
		driver.findElement(By.id("malerb")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(2000);
		WebElement hindiChk = driver.findElement(By.id("hindichbx"));
		hindiChk.click(); //Click
		Thread.sleep(2000);
		if(hindiChk.isSelected()) {
			hindiChk.click(); //UnClick
		}
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("gudururaja143@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("psw")).sendKeys("Raja@143");
		Thread.sleep(2000);
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
	}
}