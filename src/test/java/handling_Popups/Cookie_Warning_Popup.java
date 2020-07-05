package handling_Popups;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookie_Warning_Popup {

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.browserstack.com/users/sign_up");
		Thread.sleep(2000);
		
		WebElement cookie = driver.findElement(By.id("accept-cookie-notification"));
		
		cookie.click();
		
		WebElement signUpBtn=driver.findElement(By.id("user_submit"));
		
		signUpBtn.click();
		
		WebElement close = driver.findElement(By.xpath("//a[text()='Close']"));
		
		close.click();
		
	}
}
