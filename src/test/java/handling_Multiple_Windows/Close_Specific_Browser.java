package handling_Multiple_Windows;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Close_Specific_Browser {

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	driver.get("https://naukri.com");
		
		String pwh=driver.getWindowHandle();
		System.out.println(pwh);
		Set<String> whs=driver.getWindowHandles();
		System.out.println(whs);
		int count =whs.size();
		System.out.println(count);
		
		for(String w:whs)
		{
			driver.switchTo().window(w);
			System.out.println(driver.getTitle());
		}
		for(String w:whs)
		{
			//Switch to each Child Browser and close if the Browser matches below criteria
			driver.switchTo().window(w);
			if((driver.getTitle()).contains("Amazon"))
			{
				driver.close();
			}
		}
	}
}
