import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//WebElement User = driver.findElement(By.id("email"));
		//User.sendKeys("Sanjay");
		//WebElement password = driver.findElement(By.id("pass"));
			//	password.sendKeys("987654321");
		//WebElement login = driver.findElement(By.id("loginbutton"));
		//login.click();
			//	driver.findElement(By.linkText("Forgotten account")).click();

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Sanjay", Keys.ENTER);
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("Sanjay", Keys.ENTER);

	}

}
