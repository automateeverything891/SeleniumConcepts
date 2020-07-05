package findElementANDfindElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElementsContext {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		//with findElemet() we can find the a single webElement
		//If there are multiple Elements matchinng the reference,it returns the first object
		//It throws NoSuchElementException is element not found
		
		WebElement forgottenAccount = driver.findElement(By.partialLinkText("Forgotten"));
		
		forgottenAccount.click();
	}
}