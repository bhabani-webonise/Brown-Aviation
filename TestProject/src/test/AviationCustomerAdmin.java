package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AviationCustomerAdmin {
		WebDriver driver ; 
		
		@BeforeMethod 
		public void openBrowser()
		{
			
	   driver= new FirefoxDriver();
		}
		
		@Test
		
		public void beginLease() throws InterruptedException{
			
			//Login to Brown Admin Dashboard
			
			driver.manage().window().maximize();
			driver.get("http://brown:brown6186@testbal.weboapps.com/");
			driver.findElement(By.linkText("Login")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("user_email")).sendKeys("admin@brown.com");
			driver.findElement(By.id("user_password")).sendKeys("admin2014");
			driver.findElement(By.xpath("//*[@id='new_user']/div[4]/input")).click();
			
			
			driver.findElement(By.linkText("Flight201")).click();
			Thread.sleep(10000);
			driver.findElement(By.linkText("Begin Lease")).click();
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[2]/a")).click();
			driver.findElement(By.xpath("//*[@id='lease_container']/div[8]/input")).click();
		}
		
		

		@AfterMethod
		
		public void  closeBrowser(){
			
			driver.quit();
		}

}
