//Running 2 different browsers at same time firefox and chrome

package Org.qsp.TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel2DifBrowser {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	
	public void bm(String bName) {
		if(bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\Software\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if(bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			driver = new ChromeDriver();
}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void m() throws InterruptedException {
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.close();

}
}