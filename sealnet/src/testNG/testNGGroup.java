package testNG;

import org.testng.annotations.Test;

public class testNGGroup {

	@Test (groups = {"selenium"})
	public void selenium1() {
		System.out.println("selenium testing1");
	}
	@Test (groups = {"selenium"})
	public void selenium2() {
		System.out.println("selenium testing2");
	}
	@Test (groups = {"testng"})
	public void testng1() {
		System.out.println("testng testing1");
	}
	@Test (groups = {"testng"})
	public void testng2() {
		System.out.println("testng testing1");
	}
	@Test (groups = {"maven"})
	public void maven1() {
		System.out.println("maven testing1");
	}
	@Test (groups = {"maven"})
	public void maven2() {
		System.out.println("maven testing2");
	}
	
	@Test (groups = {"genkings"})
	public void genkings1() {
		System.out.println("genkings testing");
	}
	
	@Test (groups = {"genkings"})
	public void genkings2() {
		System.out.println("genkings testing2");
	}
	
	@Test (groups = {"keatolan"})
	public void keatolan1() {
		System.out.println("keatolan testing1");
	}
	@Test (groups = {"keatolan"})
	public void keatolan2() {
		System.out.println("keatolan testing2");
	}
	
}
