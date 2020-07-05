package methodsOfWebDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandles {

public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//enter the url
			driver.get("http://naukri.com");

			//to get the object reference of current browser
			String parentw=driver.getWindowHandle();
			System.out.println(parentw);
			//get title of the webpage and print it
			String pwtitle=driver.getTitle();
			System.out.println(pwtitle);
			
			//to get the object reference of all the browsers open
			Set<String> whs=driver.getWindowHandles();
			int count =whs.size();
			System.out.println(" The Number of Browsers open are "+count);
			System.out.println(whs);
			
			//to print the titles of all the windows and close the open browsers one by one
			for(String w:whs)
			{
				//to switch to the next window
				driver.switchTo().window(w);
				String s=driver.getTitle();
				System.out.println(s);
				//to close the window in each loop
				driver.close();
			}
	}
}
