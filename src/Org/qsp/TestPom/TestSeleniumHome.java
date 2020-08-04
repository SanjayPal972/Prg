//Using methods and searching two things at a time POM.
// 2 classes and searching 2 data at a time using POM.


package Org.qsp.TestPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Org.qsp.Pom.SeleniumHome;

public class TestSeleniumHome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SeleniumHome sh = new SeleniumHome (driver);
		sh.sendText("java");
		driver.navigate().back();
		sh.sendText("testNG");
	
	}

}
