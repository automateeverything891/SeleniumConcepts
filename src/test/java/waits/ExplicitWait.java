package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.opensourcebilling.org");
		WebElement submitButton=driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.submit();
		
		//create an object of WebDriverWait
		//pass the arguments "driver" and the Time in SECONDS to wait before running the next line of code
		WebDriverWait wait =new WebDriverWait(driver, 10);
		
		//Use the 'until' method in from the WebDriverWait Object created
		//Use the Methods of "ExpectedConditions" and set the condition to be satisfied to wait
		
		wait.until(ExpectedConditions.titleContains(":: Open Source Billing ::"));
		
		//Now the remaining lines of code execute only after the above condition is satisfied
		//Or after the wait Time is Expired
		String hpTitle=driver.getTitle();
		System.out.println(hpTitle);
	}
}
