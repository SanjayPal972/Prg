//We are using @Listeners to get the details of it

package Org.qsp.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LstnrDemo1.class)
public class LstnrDemo2 {
	
	@Test
	public void ab11() {
		Reporter.log("Hi",true);
	}
	
	@Test
	public void ab21() {
		Reporter.log("Hi",true);

	}
}