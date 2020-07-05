package methodsOfWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCSSValue {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	driver.get("http://demo.opensourcebilling.org");
		
		WebElement unTB=driver.findElement(By.id("email"));
		String fz=unTB.getCssValue("font-size");
		System.out.println("The size of the Element is "+fz);
		
		String clr=unTB.getCssValue("color");
		System.out.println("The color of the Element is "+clr);
		
		String fSt=unTB.getCssValue("font-style");
		System.out.println("The style of the Element is "+fSt);
		
		String fFmly=unTB.getCssValue("font-family");
		System.out.println("The font Family of the Element is "+fFmly);
	
	}
}