package locators;

import org.openqa.selenium.WebDriver;

public class locatorsManager {
	public WebDriver driver;
	public gmailLocators gmailLocators;
	public googleSearch googleSearch;
public locatorsManager(WebDriver driver) {
	this.driver=driver;
}
public googleSearch getgoogleSearch() {
	googleSearch= new googleSearch(driver);
	return googleSearch;
}
public gmailLocators getgmailLocators(String name, int pass) {
	gmailLocators=new gmailLocators(driver);
	gmailLocators.enterData(name,pass);
	return gmailLocators;
}
}

