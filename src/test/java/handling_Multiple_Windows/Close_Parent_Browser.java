package handling_Multiple_Windows;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Close_Parent_Browser {

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://naukri.com");
		
		//Store the Parent Browser reference
		String pwh=driver.getWindowHandle();
		System.out.println(pwh);
		
		//Store all the open Browsers
		Set<String> whs=driver.getWindowHandles();
		int count =whs.size();
		System.out.println(count);
		
		//Switch through each of the open Browsers
		for(String w:whs)
		{
			//If the Switched window is same as Parent Browser reference, execute the command
			driver.switchTo().window(w);
			if(pwh.equals(w))
			{
				driver.close();
			}
			else
			{
				System.out.println(driver.getTitle());
			}
		}
	}
}
