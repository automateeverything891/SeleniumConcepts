package methodsOfWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisabledANDisEnabled {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.opensourcebilling.org");
		
		WebElement unTF=driver.findElement(By.id("email"));
		Thread.sleep(1000);
		System.out.println(unTF.isDisplayed());
		
		System.out.println("====================");
		
		System.out.println(unTF.isEnabled());
	}
}