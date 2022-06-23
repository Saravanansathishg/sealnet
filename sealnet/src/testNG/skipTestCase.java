package testNG;

import org.testng.annotations.Test;

public class skipTestCase {

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
	@Test(priority = 5, enabled = false)
	public void movetotesting()
	{
		System.out.println("move to tesing");
	}
	@Test(priority = 6, enabled = false)
	public void issuesgiven()
	{
		System.out.println("issues given");
	}
	
	@Test(priority = 7)
	public void production()
	{
		System.out.println("Production the project");
	}

	
}
