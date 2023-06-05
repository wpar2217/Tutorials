package Concepts_Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Calendars {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", ""); //TO scroll window
		Thread.sleep(2000);
		
		//Calendar - 1
		/*
		 * int day = 25; driver.findElement(By.id("first_date_picker")).click();
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();
		 */
		
		//Calendar - 2
		/*
		 * int day1 = 30; driver.findElement(By.id("second_date_picker")).click();
		 * driver.findElement(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="
		 * +day1+"]")).click();
		 */

		//Calendar - 3
		String targetDate = "29/Feb/2021";
		Calendar calendar = Calendar.getInstance();
		try {
			SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/YYYY");
			targetDateFormat.setLenient(false);
			Date formattedTargetDate = targetDateFormat.parse(targetDate);
			calendar.setTime(formattedTargetDate);
		} catch (ParseException e) {
			throw new Exception("Invalid date is provided, Please check the input date!!");
		}
			int targetMonth = calendar.get(Calendar.MONTH);
			int targetYear = calendar.get(Calendar.YEAR);
			int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
			
			driver.findElement(By.id("first_date_picker")).click();
			String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(currentDate);
			calendar.setTime(new SimpleDateFormat("MMM YYYY").parse(currentDate));
			int currentMonth = calendar.get(Calendar.MONTH);
			int currentYear = calendar.get(Calendar.YEAR);
			while(currentMonth < targetMonth || currentYear < targetYear) {
				driver.findElement(By.className("ui-datepicker-next")).click();
				currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
				calendar.setTime(new SimpleDateFormat("MMM YYYY").parse(currentDate));
				currentMonth = calendar.get(Calendar.MONTH);
				currentYear = calendar.get(Calendar.YEAR);
			}
			if(currentMonth == targetMonth && currentYear == targetYear) {
				driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+targetDay+"]")).click();
			} else {
				throw new Exception("Unable to select the date because of current and target dates mismatch");
			}
	}
}