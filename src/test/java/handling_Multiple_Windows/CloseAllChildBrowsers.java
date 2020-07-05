package handling_Multiple_Windows;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseAllChildBrowsers {

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://naukri.com");
		
		//Store the parent window 
		String pwh=driver.getWindowHandle();
		System.out.println(pwh);
		
		
		//Store all the windows in a Set
		Set<String> whs=driver.getWindowHandles();
		int count =whs.size();
		System.out.println(count);
		
		//Iterate to Switch between the Windows and perform Action
		for(String w:whs)
		{
			
		//Switch to the child browsers and close them
			driver.switchTo().window(w);
			if(pwh.equals(w))
			{
				System.out.println(driver.getTitle());
			}
			else
			{
				driver.close();
			}
		}
	}
}
