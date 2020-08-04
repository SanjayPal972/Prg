import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parent = driver .getWindowHandle();
		System.out.println("Parent window handle" + parent);
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		for (String win : windows) {
			System.out.println("All window handle" + win);
			driver.switchTo().window(win);
			driver.close();
			
		}
			
	}

}
