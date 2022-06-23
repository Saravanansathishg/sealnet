package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

//import com.aventstack.extentreports.ExtentReports;

import java.io.File;

public class ExtentReport {

	  WebDriver  driver;
	  ExtentReport extentReport;
	  ExtentReporter htmlReporter() {
		return null;
	}
	//  ExtentHtmlReporter htmlReporter();
	    long startTime;
	    long endTime;
	    long Totaltime;
	    
		@BeforeSuite
		public void openbrowser() {
			extentReport = new ExtentReport();
			
			Object htmlReporter = newExtentHtmlReporter("ExtentReport.html");
			extentReport.attachreporter(htmlReporter);
			ExtentTest testcase;
			startTime = System.currentTimeMillis();
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			}
		
		private void attachreporter(Object htmlReporter) {
			// TODO Auto-generated method stub
			
		}

		private Object newExtentHtmlReporter(String string) {
			// TODO Auto-generated method stub
			return null;
		}

		@Test
		public void opengoogle() throws InterruptedException {
			Thread.sleep(10000);
			//System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
		//	testCase=((Object) extentReport).createTest("verify google title");
			driver.get("https://www.google.co.in/");
			String title = driver.getTitle();
			if(title.equals("Google")) {
				System.out.println("passed");
			}else {
				System.out.println("failed");
			}
			
				
		}
		
		@Test
		public void openbing()throws InterruptedException {
			Thread.sleep(10000);
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://bing.com/");
			String title = driver.getTitle();
			if(title.equals("bing")) {
				System.out.println("passed");
			}else {
				System.out.println("failed");
			}
			
		}	
		@Test
		public void openyahoo()throws InterruptedException {
			Thread.sleep(10000);
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://yahoo.com/");
			String title = driver.getTitle();
			if(title.equals("Yahoo")) {
				System.out.println("passed");
			}else {
				System.out.println("failed");
			}
			
		}
		
		
	    @AfterSuite
	    public void closebrowser() {
	    	driver.quit();
	    	endTime = System.currentTimeMillis();
	    	 Totaltime = endTime - startTime;
	    	
	    }
}
