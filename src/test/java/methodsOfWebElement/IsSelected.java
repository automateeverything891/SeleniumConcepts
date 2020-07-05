package methodsOfWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelected {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.opensourcebilling.org");
		
		WebElement chckBOX=driver.findElement(By.xpath("//label[text()='Keep me signed in']"));
		chckBOX.click();
		Thread.sleep(1000);
		
		WebElement tcB=driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println(tcB.isSelected());
	}
}