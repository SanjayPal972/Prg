import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		String title =driver.getTitle();
		System.out.println("-----" + driver.getTitle());
		System.out.println("Current URL is " + driver.getCurrentUrl());
		driver.close();
	}

}
