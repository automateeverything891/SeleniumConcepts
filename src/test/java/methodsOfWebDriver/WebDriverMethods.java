package methodsOfWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
				//enter the url
				driver.get("https://www.google.com");
				
				//get title of the webpage and print it
				String title=driver.getTitle();
				System.out.println(title);
				
				//Get the current url
				String cururl =driver.getCurrentUrl();
				System.out.println(cururl);
				
				//To get the sourceCode of the current page
				String src=driver.getPageSource();
//				System.out.println(src);
				
				//To get the address of the Current window reference
				String gui=driver.getWindowHandle();
				System.out.println(gui);
				
				//To navigate to new page
				//to navigate to a new url from present page
				driver.navigate().to("http://gmail.com");
				String title1=driver.getTitle();
				System.out.println(title1);
				//to navigate back to the previous page
				driver.navigate().back();
				//to navigate forward to the next page opened in the browser previously
				driver .navigate().forward();
				//to refresh the current page
				driver.navigate().refresh();
				
				
				//To close the current browser
//				driver.close();
				
				//To close the All the browsers
//				driver.quit();
	}
}
