package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class annotataionsTestcase {
  @Test
  public void test() {
	  System.out.println("i am test f");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("im before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("im after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("im before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("im after Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("im before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("im after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("im before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("im after Suite");
  }

}
