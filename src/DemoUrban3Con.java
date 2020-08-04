//Printing menus in console and Performing mouse over action

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoUrban3Con {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	/*WebElement con = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
	String console = con.getText();
	System.out.println(con.getText());  */
	List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
	System.out.println(menus.getClass());
	System.out.println("=========");
	Actions a = new Actions(driver);
	for (WebElement menuName : menus) {
		System.out.println(menuName.getText());
		Thread.sleep(2000);
	a.moveToElement(menuName).perform();
		
	}
	
}
}
