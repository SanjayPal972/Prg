import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScrnShotDemo21 {
public static void takeScreens(String name, WebDriver driver) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File screenShot = ts.getScreenshotAs(OutputType.FILE);
	File screenshotsave = new File("./Screenshot/" + name + ".png");
	Files.copy(screenShot, screenshotsave);
}
}