package Concepts_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Drop_Downs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", ""); //TO scroll window
		Thread.sleep(2000);
		
		//Single Drop down
		WebElement courseElement = driver.findElement(By.id("course"));
		Select courseNameDropdown = new Select(courseElement);
		List<WebElement> courseNameDropdownOptions = courseNameDropdown.getOptions();
		for(WebElement option : courseNameDropdownOptions) {
			System.out.println(option.getText());
		}
		courseNameDropdown.selectByIndex(4);
		Thread.sleep(2000);
		courseNameDropdown.selectByValue("net");
		Thread.sleep(2000);
		courseNameDropdown.selectByVisibleText("Python");
		Thread.sleep(2000);
		String selectedTxt = courseNameDropdown.getFirstSelectedOption().getText();
		System.out.println("Selected visible Text - " + selectedTxt);
		
		//Multiple Drop down
		WebElement ideElement = driver.findElement(By.id("ide"));
		Select ideDropdown = new Select(ideElement);
		List<WebElement> ideDropdownOptions = ideDropdown.getOptions();
		for(WebElement option1 : ideDropdownOptions) {
			System.out.println(option1.getText());
		}
		ideDropdown.selectByIndex(0);
		Thread.sleep(2000);
		ideDropdown.selectByValue("ij");
		Thread.sleep(2000);
		ideDropdown.selectByVisibleText("NetBeans");
		Thread.sleep(2000);
		ideDropdown.deselectByVisibleText("Eclipse");
		String selectedText = ideDropdown.getFirstSelectedOption().getText();
		System.out.println("Selected Visible Text - " + selectedText);
		
		List<WebElement> selectedOptions = ideDropdown.getAllSelectedOptions();
		for(WebElement selectedOption : selectedOptions) {
			System.out.println("Selected Visible Text After Deselecting - " + selectedOption.getText());
		}
	}
}