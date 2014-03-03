package test;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class TextPre {
	 
	 WebDriver driver;
	 
	 @Test (priority=1)
	  public void VerifyText(){
	  
	  String actualString;
	  String url="http://academy:analysis@stage.mlbdigitalacademy.com";
	  driver.manage().window().maximize();
	  driver.get(url+"/sign_up");  

if(driver.getPageSource().contains("Register"))
  {
    System.out.println("Pass");
  }
else
  {
    System.out.println("Fail");
  } 
	 }
	  
	 @BeforeMethod
	 public void openBrowser(){
	  //System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\ChromeDriver\\chromedriver.exe");
	  //driver = new ChromeDriver();   
	  driver = new FirefoxDriver();
	 }

	 @AfterMethod
	 public void closeBrowser(){
	 driver.quit();
	 } 

	}
	
