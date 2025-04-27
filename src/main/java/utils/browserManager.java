package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import locators.locatorsManager;

public class browserManager {
	WebDriver driver;
	public locatorsManager locatorManager;
	public chromeWebdriver bm;
	public browserManager(){
		private static WebDriver driver;
		String a=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",a+"/driversfolder/chromeFolder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		locatorManager=new locatorsManager(driver);
		//locatorManager=new locatorsManager(new chromeWebdriver().wbdriver());
	}
	 
	
	
}
