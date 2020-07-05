package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_over {

public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.vtiger.com");
		
		WebElement resBTN = driver.findElement(By.xpath("//a[text()='Resources']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(resBTN).perform();
		WebElement contBTN=driver.findElement(By.xpath("//a[text()='Contact']"));
		contBTN.click();
		
		WebElement hrNO=driver.findElement(By.xpath("//div[text()='Human Resources']/../div[2]"));
		int y=hrNO.getLocation().getY();
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+y+")");
		System.out.println(hrNO.getText());
	
	}
}
