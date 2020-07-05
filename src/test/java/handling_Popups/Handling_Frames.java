package handling_Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Frames {

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:D:\\SELENZIUMZ\\Selenium_Concepts\\Support Files\\P1.html");
		
		WebElement unTB = driver.findElement(By.id("t1"));
		unTB.sendKeys("Selenium");
		
		WebElement frame=driver.findElement(By.id("f1"));
		
	/*	//Switch into Frame by index
		driver.switchTo().frame(0);
		WebElement pwTB = driver.findElement(By.id("t2"));
		pwTB.sendKeys("Katalon");
		
		//Switch into frame by String
		driver.switchTo().frame("f1");
		WebElement pwTB = driver.findElement(By.id("t2"));
		pwTB.sendKeys("katademo");
		
	*/	//Switch into frame by using Web element
		driver.switchTo().frame(frame);
		WebElement pwTB = driver.findElement(By.id("t2"));
		pwTB.sendKeys("katalon");
		
	/*	//Switch to parent window
		driver.switchTo().parentFrame();
		unTB.clear();
		unTB.sendKeys("Cucumber");
		
	*/	//Switch to main window
		driver.switchTo().defaultContent();
		unTB.clear();
		unTB.sendKeys("Gherkin");	
	}
}
