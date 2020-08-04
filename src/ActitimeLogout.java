//TRYING TO LOGOUT USING XPATH

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogout {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//input[@id=('username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=('pwd')]")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id=('loginButton')]")).click();
		String tl=driver.getTitle();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='logout']")).click();

	}

}
