//Taking Screenshots of menus

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrnShotDemo2 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
	System.out.println(menus.getClass());
	System.out.println("=========");
	Actions a = new Actions(driver);
	for (WebElement menuName : menus) {
		String name =menuName.getText();
		System.out.println(menuName.getText());
		Thread.sleep(2000);
	a.moveToElement(menuName).perform();
	ScrnShotDemo21.takeScreens(name, driver);
		
}
}
}
