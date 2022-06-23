package testNG;

import org.testng.annotations.Test;

public class softwareLifeCycle {
	@Test(priority = 1)
	public void startplan()
	{
		System.out.println("Start the plan");
	}
	@Test(priority = 2)
	public void analyse()
	{
		System.out.println("analayse the project");
	}
	@Test(priority = 3)
	public void developtheproject()
	{
		System.out.println("develop the project");
	}
	@Test(priority = 4)
	public void deploytheproject()
	{
		System.out.println("deploy the project");
	}
	@Test(priority = 5)
	public void production()
	{
		System.out.println("Production the project");
	}

}
