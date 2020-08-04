//Handling Upload popup using 3rd party tool AutoIt.We cannot use upload popup using selenium at that time 
//we need to use 3rd party tool

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupUpload {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/test/upload/");
	WebElement upload = driver.findElement(By.id("file_wraper0"));
	upload.click();
	Runtime r = Runtime.getRuntime();
	r.exec("C:\\Users\\Nitin\\Desktop\\HTML classes\\Editor.exe");
}
}
