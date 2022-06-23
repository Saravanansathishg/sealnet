package testNG;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class parameterizationTestng {
    @Test
    @Parameters("Name")
	public void printname(String name) {
		System.out.println("Name is "+ name);
	}
}
