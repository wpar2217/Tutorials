package Concepts_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Functions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		//URL
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL - " + currentURL);
		
		//Title
		String title = driver.getTitle();
		System.out.println("Title - " + title);
		
		//Page source
		String page_Source = driver.getPageSource();
		System.out.println("Page source - " + page_Source);
	}
}