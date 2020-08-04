//Scrolling the scroolbar to up and down side we need to use 
//JavaScriptExecutor

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JaScrptEceDemo {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	/*js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-500)"); */
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");// Used to scroll the bar completely downwards(from up to down) 
	Thread.sleep(2000);
	js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");// Used to scroll the bar completely upwards(from down to up)
	}
}
