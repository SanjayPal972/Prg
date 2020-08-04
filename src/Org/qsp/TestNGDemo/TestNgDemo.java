package Org.qsp.TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgDemo {
	@Test
	public void m1(){
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Reporter.log("Hey...!",true);
	}
	@Test
	public void m2(){
		Reporter.log("Hii",true);
	}
}
