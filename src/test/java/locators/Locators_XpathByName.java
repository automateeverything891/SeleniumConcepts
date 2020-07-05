package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_XpathByName {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com/");
		
		//Finding the Forgot account link by using Xpath by Name
		//The Element should be in <a /a> tag and have text
		WebElement forgotAccount = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		
		forgotAccount.click();
	}
}
