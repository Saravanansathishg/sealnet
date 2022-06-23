package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class suiteExample {
    WebDriver  driver;
    long startTime;
    long endTime;
    long Totaltime;
    
	@BeforeSuite
	public void openbrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	@Test
	public void opengoogle() throws InterruptedException {
		Thread.sleep(10000);
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	}
	
	@Test
	public void openbing()throws InterruptedException {
		Thread.sleep(10000);
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bing.com/");
	}	
	@Test
	public void openyahoo()throws InterruptedException {
		Thread.sleep(10000);
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yahoo.com/");
	}
	
	
    @AfterSuite
    public void closebrowser() {
    	driver.quit();
    	endTime = System.currentTimeMillis();
    	 Totaltime = endTime - startTime;
    	
    }
    
}
