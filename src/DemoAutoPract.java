import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAutoPract {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']/li/a[@title='Dresses']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[@class='tree dynamized']/li/a[contains(.,'Casual Dresses')]")).click();
	Actions a = new Actions(driver);
	WebElement dress = driver.findElement(By.xpath("//img[@title='Printed Dress"));
	a.moveToElement(dress).perform();
	driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
	
	
	    
	
	
	}
	}

