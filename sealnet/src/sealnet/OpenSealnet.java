package sealnet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class OpenSealnet {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.out.println("Welcome karthi to automation");

			System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://my4.sealnet.co/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='navbar_global']/ul/li[2]/a/span")).click();
			Thread.sleep(9000);
			driver.findElement(By.id("Username")).sendKeys("sealnet.user@dnexport.com.my");
			driver.findElement(By.id("TxtPwd")).sendKeys("Admin@321");
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[1]/form/fieldset/div[3]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='sidenav-collapse-main']/ul/li[5]/a/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='navbar-SMKDECLARATION']/ul/li[1]/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[3]/div[1]/div/div/button")).click();
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			driver.findElement(By.id("TxtJobNo")).sendKeys("Ref12345",Keys.TAB);
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[2]/div/div/div[3]/div[2]/div/div/div/span")).click();
			driver.findElement(By.xpath("//*[@id='ant-blazor-9bac493b-08a0-4bf3-be17-b59983be040a']/div/input")).sendKeys("20/05/2022",Keys.TAB);
			Thread.sleep(3000);
		   // driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div/div[2]/table/tbody/tr[4]/td[6]/div")).click();
		
			
		

	}

}
