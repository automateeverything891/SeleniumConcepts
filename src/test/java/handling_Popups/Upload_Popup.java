package handling_Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_Popup {

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://www.csm-testcenter.org/test?do=show&subdo=common&test=file_upload");
				
		String path="C:\\Users\\Dell\\Desktop\\Demo data.xlsx";
		driver.findElement(By.xpath("//input[@name='file_upload']")).sendKeys(path);;
		
		
		WebElement upload=driver.findElement(By.xpath("//input[@name='http_submit']"));
		upload.click();
			
		}
}
