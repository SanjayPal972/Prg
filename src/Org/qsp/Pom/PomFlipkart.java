package Org.qsp.Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomFlipkart {
	@FindBy(name = "q")
	private WebElement search;
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchBtn;
	
	public PomFlipkart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void sendText(String text){
		search.sendKeys(text,Keys.ENTER);
	}
	public void clksearchbtn(){
		searchBtn.click();
	}
}
