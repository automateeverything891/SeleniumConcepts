package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_PartialLinkText {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com/");
		
		//Finding the Element by using Locator PartiallinkText. 
		//The Element should be in <a a> tag  in html document
		//We can use this when the link text is too long or has unbreakable spaces
		WebElement forgottenAccount = driver.findElement(By.partialLinkText("Forgotten"));
		
		forgottenAccount.click();
	}
}
