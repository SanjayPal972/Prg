import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TxtB {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nitin/Desktop/HTML%20classes/TxtB.html");
		driver.findElement(By.name("textA")).sendKeys("What is your name");
		driver.findElement(By.name("textB")).sendKeys("Sanjay Pal");
	}

}
