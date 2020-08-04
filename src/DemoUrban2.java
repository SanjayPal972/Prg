import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoUrban2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
    	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[contains(.,'Sale')]/parent::li")).click();

		//WebElement liv = driver.findElement(By.xpath("//li/span[contains(.,'Living')]"));
	    //driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys(liv.getText(), Keys.ENTER);
		WebElement sale = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(sale).perform();
		WebElement wood = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/descendant::span[contains(.,'Wooden Sofa Sets')]"));
		wood.click();
		
		

	}

}
