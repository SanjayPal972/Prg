//SELECTION DOB USING XPATHS USING SELECT CLASS & PRINTING DATES IN CONSOLE

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb9July {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	/*driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("16",Keys.ENTER);
	driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Feb",Keys.ENTER);
	driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1993",Keys.ENTER);*/
	WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s = new Select(day);
	s.selectByValue("16");
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select s1 = new Select(month);
	s1.selectByVisibleText("Feb");
	WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select s2 = new Select(year);
	s2.selectByValue("1993");
	System.out.println("=========");
	
	List <WebElement> days = s.getOptions();  //Printing in console
	for (WebElement dayValue : days) {
		System.out.println(dayValue.getText());
		
	} {
		
	}
}
}
