import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		Thread.sleep(1000);
		co.addArguments("--disable notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
	//	driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("Swargate,pune");
	//	driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("Thane,Mumbai");;
		
	}
}


/*
 import java.util.ArrayList;
 
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetWindowSize;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
        driver.findElement(By.xpath("//span[contains(.,'Electronics')]")).click();
		List <WebElement> Mi =  (List<WebElement>) driver.findElement(By.xpath("//span[contains(.,'Electronics')]/ancestor::ul[@class='_114Zhd']"));
		Actions a = new Actions(driver);
		for (WebElement Web : Mi) {
			a.moveToElement(Web).perform();
			}
	    }
	}
*/

