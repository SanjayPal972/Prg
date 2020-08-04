package Org.qsp.TestPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Org.qsp.Pom.PomFlipkart;

public class TestFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

		PomFlipkart dem = new PomFlipkart(driver);
		Thread.sleep(5000);
		dem.sendText("iphone");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		dem.sendText("Realme");
		
	}

}
