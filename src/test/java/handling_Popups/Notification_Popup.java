package handling_Popups;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_Popup {

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();

		//Create a ChromeOptions() object
		ChromeOptions options=new ChromeOptions();
		
		//Pass the arguments to disable notifications
		//These are default keywords for defined functions in ChromeOptions()
		options.addArguments("--disable-notifications");
		
		//Pass the options object in ChromeDriver()
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

		driver.get("https://www.bestbuy.com/site/searchpage.jsp?id=pcat17071&st=SSL&intl=nosplash");

	}
	
}
