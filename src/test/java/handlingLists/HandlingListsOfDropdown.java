package handlingLists;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingListsOfDropdown {
	
	
	WebDriver driver;
	
	@Test
	public void selectNormalDropdown() {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		List<WebElement> options = dropdown.getOptions();
		
		for(int i =0; i<options.size(); i++) {
			
			if(options.get(i).getText().equalsIgnoreCase("database")){
				options.get(i).click();
			}
		}
		
	}
	

}
