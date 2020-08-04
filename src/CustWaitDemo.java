//Anonmous class 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustWaitDemo {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Nitin/Desktop/HTML%20classes/TxtB.html");
	new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
		@Override
		public Boolean apply(WebDriver driver) {
        return driver.findElement(By.name("textB")).isDisplayed();
		}
	});
	driver.findElement(By.name("textB")).sendKeys("Sanjay");
	}

}
