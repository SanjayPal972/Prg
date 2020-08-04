package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadDataXlDemo2 {
	@Test(dataProviderClass = ReadDataXlDemo.class, dataProvider = "getData")
public void abc(String un, String pw){
	Reporter.log(un + " " + pw, true);
}
}
