//Performing Mouse over action

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneAssign {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	WebElement Rin=driver.findElement(By.xpath("//li[@class='menuparent repb']/a[contains(.,'Rings')]"));
    driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys(Rin.getText(),Keys.ENTER);
    driver.findElement(By.xpath("//img[@alt='The Nury Vanki Ring']")).click();
    WebElement Error = driver.findElement(By.xpath("//div[contains('* This field is required')]"));
    String Errortext =Error.getText();
    System.out.println(Errortext);
	WebElement all = driver.findElement(By.xpath("//a[contains(.,'All Jewellery')]"));
	Actions kad =new Actions(driver); 
	/*List<WebElement> menus = driver.findElements(By.xpath("//a[contains(.,'Rings')]"));
	System.out.println(menus.getClass());
	System.out.println("=========");
	Actions a = new Actions(driver);
	for (WebElement menuName : menus) {
		System.out.println(menuName.getText());
		Thread.sleep(2000);
		a.moveToElement(menuName).perform();
 }*/
}
}