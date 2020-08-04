package Org.qsp.TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PractTNg2 {

	@Test(groups = "Fun",dependsOnGroups = "Int")
	public void g1(){
		Reporter.log("H1",true);
	}
	@Test(groups = "Int")
	public void g2(){
		Reporter.log("H2",true);
	}
	
	@Test(groups = "Fun",dependsOnGroups = "Int")
	public void g3(){
		Reporter.log("H3",true);
	}
	@Test(groups = "Int")
	public void g4(){
		Reporter.log("H4",true);
	}
	
	@Test(groups = "Fun",dependsOnGroups = "Int")
	public void g5(){
		Reporter.log("H5",true);
	}
	
	@Test(groups ="Smoke")
	public void g6(){
		Reporter.log("H6",true);
	}
	
	@Test(groups = "Unit")
	public void g7(){
		Reporter.log("H7",true);
	}
}
