import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;

public class Pract2Bluestone {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		WebElement Rin = driver.findElement(By.xpath("//li[@class='menuparent repb']/a[contains(.,'Rings')]"));
		Actions a = new Actions(driver);
		a.moveToElement(Rin).perform();
		driver.findElement(By.xpath("//a[@title='Diamond Rings']/parent::li/descendant::a[contains(.,'Diamond Rings')]")).click();
		driver.findElement(By.xpath("//img[@alt='The Nury Vanki Ring']")).click();
		Set<String> parent = driver .getWindowHandles();		// This method is used to Switch windows
		for (String par : parent) {
			driver.switchTo().window(par);    // Switching tabs and handling windows
			System.out.println("Windows Handled" + driver.getTitle());
			}
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
	}
}







//PERFORMING MOUSE OVER ACTION ON MENUS & PRINTING MENUS IN CONSOLE//

/*import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pract2Bluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
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
//In line no 16 we are finding the xpath of menus(parent to child)
*/



