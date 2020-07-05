package findElementANDfindElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElementContext {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		
		//with indElements() we get get a list of WebElements
		//If the reference pints to multiple Elements , It returns address of all the Elements
		//If no Element is found, it returns Empty List
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int count=links.size();
		System.out.println(links);
		System.out.println(count);
		
		for(WebElement link:links)
		{
			String s=link.getText();
			System.out.println(s);
		}
	}
}