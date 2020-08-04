package Org.qsp.TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.remote.DesiredCapabilities;



public class PractNg {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox.exe");
		String Firefoxdriverpath = ".\\Software\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", Firefoxdriverpath);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

			}
}



/*
  package Org.qsp.TestNGDemo;
 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PractNg {
	WebDriver driver;
	
	@BeforeSuite
	public void beforeS(){
		Reporter.log("Before Suite",true);
	}
	
	@BeforeTest
	public void beforeT(){
		Reporter.log("Before Test",true);
	}
	
	@BeforeClass
	public void beforeC(){
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe\\");
		Reporter.log("Before Class",true);
	}
	
	@BeforeMethod
	public void beforeM(){
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Reporter.log("Before Method",true);
	}
	
	@Test
	public void m1(){
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("manager", Keys.ENTER);
		Reporter.log("Hii",true);
		}
	
	@Test
	public void m2(){
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("admin", Keys.ENTER);
	Reporter.log("Bye",true);	
	}
	
	@AfterMethod
	public void afterM(){
	driver.close();	
	Reporter.log("After Method",true);
	}
	
	@AfterClass
	public void afterC(){
		driver.quit();
		Reporter.log("After Class",true);
	}
	
	@AfterTest
	public void afterT(){
		Reporter.log("After Test",true);
	}
	
	@AfterSuite
	public void afterS(){
		Reporter.log("After Suite",true);
	}

}
*/