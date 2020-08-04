package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(groups = "Functional")
	public void m1() {
		Reporter.log("Heyyyy..! 1",true);
		}
	
	@Test(groups = "Integration",dependsOnGroups = "Functional")
	public void m2() {
		Reporter.log("Heyyyy..! 2",true);
		
	}
	@Test(groups = "Functional")
	public void m3() {
		Reporter.log("Heyyyy..! 3",true);

	}
	@Test(groups = "Integration",dependsOnGroups = {"Functional","Unit"})
	public void m4() {
		Reporter.log("Heyyyy..! 4",true);
	}
	
	@Test(groups = "Functional")
	public void m5() {
		Reporter.log("Heyyyy..! 5",true);
	}
	
	@Test(groups = "Unit")
	public void m6() {
		Reporter.log("Heyyyy..! 6",true);
}
}
	
//In this case m2() will print 3 times as we have used invocationCount and we have given the priority 0,
//So it will print at last
/*package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(priority = 2)
	public void m1() {
		Reporter.log("Heyyyy..! 1",true);
		}
	
	@Test(priority = 0, invocationCount = 3)
	public void m2() {
		Reporter.log("Heyyyy..! 2",true);
		
	}
	@Test(priority = -5)
	public void m3() {
		Reporter.log("Heyyyy..! 3",true);

	}
}
*/

// If we don't want to print sometext we need to use enabled=false or invocationCount=0
/*package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test()
	public void m1() {
		Reporter.log("Heyyyy..! 1",true);
		}
	
	@Test(enabled = false)
	public void m2() {
		Reporter.log("Heyyyy..! 2",true);
		
	}
	@Test()
	public void m3() {
		Reporter.log("Heyyyy..! 3",true);

	}
}
*/


//Priority lower to higher
/*package Org.qsp.TestNGDemo;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(priority = 3)
	public void m1() {
		Reporter.log("Heyyyy..! 1",true);
		}
	
	@Test(priority = 1)
	public void m2() {
		Reporter.log("Heyyyy..! 2",true);
		
	}
	@Test(priority = 2)
	public void m3() {
		Reporter.log("Heyyyy..! 3",true);
		
	}
}
*/