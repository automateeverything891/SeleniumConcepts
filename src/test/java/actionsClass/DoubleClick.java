package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

		public static WebDriver driver;
			
			public static void main(String[] args) throws InterruptedException {
				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("https://www.google.com/intl/en-GB/drive/");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				WebElement gm=driver.findElement(By.linkText("Go to Google Drive"));
				gm.click();
				
				driver.switchTo().activeElement().sendKeys("katademo01@gmail.com",Keys.ENTER);
				Thread.sleep(2000);
				driver.switchTo().activeElement().sendKeys("katalon123",Keys.ENTER);		
				Thread.sleep(2000);
				WebElement file1=driver.findElement(By.xpath("//div[contains(text(),'sample.xlsx')]"));
				
				Actions act=new Actions(driver);
				act.doubleClick(file1).perform();
				
				}
			
}
