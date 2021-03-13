package Cucumber;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Base {
	public static WebDriver driver;
	
	
	public static WebDriver getDriver() throws IOException {
		Properties properties=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\test\\java\\Cucumber\\global.properties");
		properties.load(fis);
		 WebDriverManager.chromedriver().setup();
	    	driver=new ChromeDriver();
	    	driver.get(properties.getProperty("url"));
	    	return driver;
	}

}
