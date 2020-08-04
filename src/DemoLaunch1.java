import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement sign =driver.findElement(By.id("nav-link-accountList"));
		sign.click();
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.id("ap_email"));
		user.sendKeys("Sanjay");
		
		
	}

}
