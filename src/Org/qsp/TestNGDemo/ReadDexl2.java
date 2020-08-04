package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadDexl2 {
	@Test(dataProviderClass = ReadDexl.class, dataProvider = "getData")
	public void ab(String user, String pass){
		Reporter.log(user + " " + pass, true);
}
}