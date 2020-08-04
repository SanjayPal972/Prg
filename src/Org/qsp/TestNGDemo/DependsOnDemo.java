package Org.qsp.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnDemo {
	

	@Test(dependsOnMethods = "m2")
	public void m1() {
		System.out.println("Hi 1");
	}
	
	@Test()
	public void m2() {
		System.out.println("Hi 2");
	}
	
	@Test()
	public void m3() {
		System.out.println("Hi 3");
	}
}

/*
package Org.qsp.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnDemo {
	

	@Test(dependsOnMethods = "m2")
	public void m1() {
		System.out.println("Hi 1");
	}
	
	@Test()
	public void m2() {
		System.out.println("Hi 2");
		Assert.fail();       //It is used failed the test case Intentionally
	System.out.println("abcd");
	}
	
	@Test()
	public void m3() {
		System.out.println("Hi 3");
	}
}
*/

/*
package Org.qsp.TestNGDemo;

import org.testng.annotations.Test;

public class DependsOnDemo {
	

	@Test(dependsOnMethods = {"m2","m3"})
	public void m1() {
		System.out.println("Hi 1");
	}
	
	@Test()
	public void m2() {
		System.out.println("Hi 2");
	}
	
	@Test()
	public void m3() {
		System.out.println("Hi 3");
	}
}
*/