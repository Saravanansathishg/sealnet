package testNG;

import org.testng.annotations.Test;

public class dependancyManagement {

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
	@Test(dependsOnMethods = "analyse")
	public void deploytheproject()
	{
		System.out.println("deploy the project");
	}
	@Test(dependsOnMethods = "issuesgiven")
	public void movetotesting()
	{
		System.out.println("move to tesing");
	}
	@Test(priority = 6)
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
