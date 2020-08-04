//Open flipkart and click on the highest rated book

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipDemo {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java Books", Keys.ENTER);
    List<WebElement> rating = driver.findElements(By.xpath("//div[@class='hGSR34']"));
    for (WebElement webElement : rating) {
    	System.out.println(webElement.getText());
		}
	}

}
