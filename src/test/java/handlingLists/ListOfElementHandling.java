package handlingLists;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListOfElementHandling {
	
WebDriver driver;
	
	@Test
	public void selectNormalDropdown() {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.xpath("(//div[@class='desktop-navLink']/a)[1]")).click();
		
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='desktop-navLink']/div/div/div/li/ul/li/a"));
		
		for(int i =0; i<options.size(); i++) {
			
			if(options.get(i).getText().equalsIgnoreCase("Jeans")){
				options.get(i).click();
			}
		}
		
	}
	

}
