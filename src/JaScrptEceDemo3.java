//Scrolling down at the bottom(using javascript Executor) and taking a screenshot of the page.

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class JaScrptEceDemo3 {
	public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenShot = ts.getScreenshotAs(OutputType.FILE);
			File screenshotSave = new File("./ScreenShot/amazon.png");
			Files.copy(screenShot, screenshotSave);
	}

}
