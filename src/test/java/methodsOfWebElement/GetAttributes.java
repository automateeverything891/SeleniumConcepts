package methodsOfWebElement;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributes {

		public static WebDriver driver;
			
			public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("http:www.google.com");
				
				String title=driver.findElement(By.tagName("title")).getAttribute("textContent");
				
				System.out.println(title);
			}
}