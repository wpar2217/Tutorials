package Concepts_Practice;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Load_Timeout {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("Page Load Timeout: " + duration.toMillis()+" milli seconds");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}