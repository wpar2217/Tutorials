package Concepts_Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData_From_PropertyFile {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\Users\\parth\\eclipse-workspace\\Selenium_Practice\\src\\test\\resources\\Properties\\testdata.properties");
		properties.load(inputstream);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		
		FileOutputStream outputstream = new FileOutputStream("C:\\Users\\parth\\eclipse-workspace\\Selenium_Practice\\src\\test\\resources\\Properties\\testdata.properties");
		properties.setProperty("testdate", "23062023");
		properties.store(outputstream, "This is customer data from TC2");
		
	}
}