package locators;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.google.protobuf.Duration;

public class googleSearch {
	WebDriver driver;
	
	@FindBy(name="q")
	WebElement searchtext;

	@FindBy(xpath="//input[@data-ved='0ahUKEwi7m7D4792MAxVaS2wGHaQXEbQQ4dUDCCA']")
	WebElement search;

	public googleSearch(WebDriver driver){
		this.driver=driver;
		
		
	}
	public void clickonSearchbtn(String name)  
	{
		
		driver.findElement(By.name("q")).sendKeys(name);
		//driver.switchTo().frame("//div[@id='Alh6id']");
		driver.manage().timeouts()
		.implicitlyWait(java.time.Duration.ofSeconds(9));
		List<WebElement> slnm=driver.findElements(By.xpath("//div[@class='lnnVSe']"));
		int a=slnm.size();
		System.out.print("Total Size "+a);
		int count=0;
		for(WebElement slm:slnm) {
			System.out.print("Avika");
			count=count+1;
			System.out.print(slm.getText().trim());
		}
		//driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]/center/input[@class=\"gNO89b\"]")).click();

		//searchtext.sendKeys("Selenium");
		//driver.search.click();
		
		System.out.print("Success");
	}
}
