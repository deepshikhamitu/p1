package utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chromeWebdriver {
	private static WebDriver driver;
	public WebDriver wbdriver() {
		if (driver == null) {
		String a=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",a+"/driversfolder/chromeFolder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		
		
	} return driver;}
}
