package browser_Launching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Launching {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		Thread.sleep(2000);
		driver.close();
	}
}   