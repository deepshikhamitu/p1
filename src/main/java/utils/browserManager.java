package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import locators.locatorsManager;

public class browserManager {
	WebDriver driver;
	public locatorsManager locatorManager;
	public chromeWebdriver bm;
	public browserManager(){
		
		locatorManager=new locatorsManager(new chromeWebdriver().wbdriver());
	}
	 
	
	
}
