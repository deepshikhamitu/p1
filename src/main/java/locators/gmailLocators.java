package locators;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class gmailLocators {
	WebDriver driver;
public gmailLocators(WebDriver driver) {
	this.driver=driver;
}
public void enterData(String name, int pass) {
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("deep@test.com");
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	String text=driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")).getText();
	String expectedText="Couldn’t find your Google Account";
	System.out.print(text);
	assertEquals(text,expectedText,"PassTest Case");
	/*
	driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("Strjcj");
	driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
	*/
	
}

}
