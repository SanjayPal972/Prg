//PERFORMING RIGHT CLICK,LEFT CLICK AND DOUBLE CLICK//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuru {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	    WebElement rclk =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	    WebElement dblclk =driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	    Thread.sleep(2000);
	    Actions a = new Actions(driver);
	   // a.contextClick(rclk).perform(); //performing right click action
	   //a.contextClick().perform();       //performing click action
	   a.doubleClick(dblclk).perform();   //performing double click action
	}

}


//How to perform an Right click action