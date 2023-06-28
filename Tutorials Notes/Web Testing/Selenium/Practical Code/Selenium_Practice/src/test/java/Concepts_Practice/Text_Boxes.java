package Concepts_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Boxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://github.com/login");
		Thread.sleep(2000);
		WebElement usernameTxt = driver.findElement(By.id("login_field"));
		if(usernameTxt.isDisplayed()) {
			if(usernameTxt.isEnabled()) {
				usernameTxt.sendKeys("partha");
				String enteredTxt = usernameTxt.getAttribute("value");
				System.out.println(enteredTxt);
				Thread.sleep(2000);
				usernameTxt.clear();
			} else {
				System.out.println("Username text box is not enabled");
			}
		} else {
			System.out.println("Username text box is not displayed");
		}
	}
}