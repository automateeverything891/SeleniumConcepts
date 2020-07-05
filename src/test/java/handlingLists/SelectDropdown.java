package handlingLists;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {
	
	WebDriver driver;
	
	@Test
	public void selectNormalDropdown() {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByValue("database");
		
	}
	
	

}
